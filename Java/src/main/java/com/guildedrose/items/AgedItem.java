package com.guildedrose.items;

import com.guildedrose.entities.Item;

public class AgedItem extends Item {

    public AgedItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void update() {
        this.sellIn--;
        this.quality++;

        this.sellQualityToFifty();
        this.sellQualityToZero();
    }

    @Override
    public int getSellin() {
        return this.sellIn;
    }
}
