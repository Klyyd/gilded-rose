package com.guildedrose.repositories;
import com.guildedrose.TestBufferedWriter;
import com.guildedrose.entities.Item;
import com.guildedrose.items.*;

import java.util.ArrayList;

public class inMemoryRepository implements IInventoryRepository {

    private ArrayList<Item> items = new ArrayList<>();

    public inMemoryRepository() {
        items.add(new AgedItem("Aged Item",15,7));
        items.add(new ConjuredItem("Conjured Item",8,22));
        items.add(new LegendaryItem("Sulfuras",0,10));
        items.add(new GenericItem("Item normal",15,33));
        items.add(new EventItem("Backstage passes",23,4));
    }
    @Override
    public ArrayList<Item> GetInventory() {
        return items;
    }

    @Override
    public void SaveInventory(ArrayList<Item> items) {
        TestBufferedWriter write = new TestBufferedWriter("inventory.txt");
        write.traitement(items);
    }
}
