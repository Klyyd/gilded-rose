package com.guildedrose.items;

import com.guildedrose.entities.Item;

public class GenericItem extends Item {

    public GenericItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void update() {
        this.sellIn--;
        this.quality--;

        if (this.sellIn < 0)
            this.sellIn--;

        this.sellQualityToFifty();
        this.sellQualityToZero();
    }
}
