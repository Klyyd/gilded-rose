package com.guildedrose.items;

import com.guildedrose.entities.Item;

public class EventItem extends Item {

    public EventItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void update() {
        this.sellIn--;

        if(this.quality < 50 && this.quality > 10){
            this.quality ++ ;
        }
        else if(this.quality < 49 && this.sellIn <= 10 && this.sellIn > 5){
            this.quality += 2;
        }
        else if(this.quality < 48 && this.sellIn <= 5 && this.sellIn > 0){
            this.quality += 3;
        }
        else if(this.sellIn == 0){
            this.quality = 0;
        }

        this.sellQualityToFifty();
        this.sellQualityToZero();
    }
}
