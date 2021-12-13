package com.guildedrose.items;

import com.guildedrose.entities.Item;

public class LegendaryItem extends Item {

    public LegendaryItem(String name, int sellIn, int quality){
        super(name, sellIn, quality);
    }

    @Override
    public void update() {

    }

    @Override
    public int getSellin() {
        return this.sellIn;
    }


}
