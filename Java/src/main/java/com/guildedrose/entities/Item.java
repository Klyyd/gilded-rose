package com.guildedrose.entities;

public abstract class Item {

    protected String name;
    protected int sellIn;
    protected int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public abstract void update();

    protected void sellQualityToFifty() {
        if (this.quality > 50)
            this.quality = 50;
    }

    protected void sellQualityToZero() {
        if (this.quality < 0)
            this.quality = 0;
    }

    @Override
    public String toString() {
        return this.name +", "+ this.sellIn +", "+ this.quality;
    }
}
