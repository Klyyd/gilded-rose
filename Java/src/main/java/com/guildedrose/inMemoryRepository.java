package com.guildedrose;

import com.guildedrose.entities.Item;
import com.guildedrose.items.AgedItem;
import com.guildedrose.items.EventItem;
import com.guildedrose.items.GenericItem;
import com.guildedrose.items.LegendaryItem;

import java.util.ArrayList;

public class inMemoryRepository implements IInventoryRepository {

    private ArrayList<Item> items = new ArrayList<Item>();

    public inMemoryRepository() {
        items.add(new AgedItem("Aged Brie", 5, 5));
        items.add(new LegendaryItem("Sulfuras", 10, 1));
        items.add(new EventItem("Backstage Passes", 10, 0));
        items.add(new GenericItem("Item générique", 7, 9));
    }
    @Override
    public ArrayList<Item> GetInventory() {
        return items;
    }
    @Override
    public void SaveInventory(ArrayList<Item> items) {
        this.items = items;
    }
}
