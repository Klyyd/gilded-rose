package com.guildedrose.items;

import com.guildedrose.entities.Item;

public class GenericItem extends Item {

    public GenericItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void update() {
        this.sellIn--;

        if(this.sellIn > 0){
            this.quality --;
        }
        else{
            this.quality -= 2;
        }


        this.sellQualityToFifty();
        this.sellQualityToZero();
    }
}
