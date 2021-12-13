package com.guildedrose.items;

import com.guildedrose.entities.Item;

public class ConjuredItem extends Item {

    public ConjuredItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void update() {
        this.sellIn--;
        this.quality -= 2;

        this.sellQualityToFifty();
        this.sellQualityToZero();
    }

    @Override
    public int getSellin() {
        return this.sellIn;
    }
}
