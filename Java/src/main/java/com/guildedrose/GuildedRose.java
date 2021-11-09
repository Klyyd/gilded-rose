package com.guildedrose;

public class GuildedRose {

    Item[] items;

    public GuildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item i: this.items) {
            this.keepQualityInRange(i);
            this.updateItemQuality(i);
        }
    }

    private void updateItemQuality(Item item) {
        if (item.name == "Sulfuras") return;
        if (item.name == "Aged Brie") this.updateAgedBrieQuality(item);
        else if (item.name == "backstage passes") this.updateBackstagePassesQuality(item);
        else this.updateGenericQuality(item);
    }

    private void updateAgedBrieQuality(Item item) {
        item.quality++;
    }

    private void updateBackstagePassesQuality(Item item) {
        item.quality++;
        if (item.sellIn < 10) item.quality++;
        if (item.sellIn < 5) item.quality++;
        if (item.sellIn < 0) item.quality = 0;
    }

    private void updateGenericQuality(Item item) {
        item.quality--;
        item.sellIn--;
        if (item.sellIn < 0) item.quality--;
    }

    private void keepQualityInRange(Item item) {
        if (item.quality < 0) item.quality = 0;
        if (item.quality > 50) item.quality = 50;
    }

    public static void main(String[] args) {
        Item sulfuras = new Item("Sulfuras", 15, 50);
        Item aged_brie = new Item("Aged Brie", 15, 45);
        Item backstage_passes = new Item("Backstage passes", 12, 34);

        Item[] items = new Item[]{sulfuras, aged_brie, backstage_passes};

        GuildedRose guildedrose = new GuildedRose(items);

        guildedrose.updateQuality();

        System.out.println(sulfuras.toString());
        System.out.println(aged_brie.toString());
        System.out.println(backstage_passes.toString());
    }
}
