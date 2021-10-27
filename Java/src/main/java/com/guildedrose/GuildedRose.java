package com.guildedrose;

public class GuildedRose {

    Item[] items;

    public GuildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < 30; i++) {
            for (Item item : items) {
                if (!item.name.equals("Aged Brie") && item.name.equals("Backstage passes")) {
                    if (item.quality > 0) {
                        if (!item.name.equals("Sulfuras")) {
                            item.quality -= 1;
                        }
                    }
                } else {
                    if (item.quality < 50) {
                        item.quality += 1;
                        if (item.name.equals("Backstage passes")) {
                            if (item.sellIn < 11) {
                                if (item.quality < 50) {
                                    item.quality += 1;
                                }
                            }
                            if (item.sellIn < 6) {
                                if (item.quality < 50) {
                                    item.quality += 1;
                                }
                            }
                        }
                    }
                }
                if (!item.name.equals("Sulfuras")) {
                    item.sellIn -= 1;
                }
                if (item.sellIn < 0) {
                    if (!item.name.equals("Aged Brie")) {
                        if (item.name.equals("Backstage passes")) {
                            if (item.quality > 0) {
                                if (!item.name.equals("Sulfuras")) {
                                    item.quality -= 1;
                                }
                            }
                        } else {
                            item.quality -= item.quality;
                        }
                    } else {
                        if (item.quality < 50) {
                            item.quality += 1;
                        }
                    }
                }
            }
        }
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
