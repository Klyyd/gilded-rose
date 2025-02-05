package com.guildedrose;

import com.guildedrose.entities.Item;
import com.guildedrose.items.LegendaryItem;
import com.guildedrose.repositories.IInventoryRepository;

import java.util.ArrayList;

public class Shop {
    private IInventoryRepository repository;

    public Shop(IInventoryRepository repository){
        this.repository = repository;
    }

    public void UpdateQuality(int day){

        ArrayList<Item> items = this.repository.GetInventory();

        for(int i = 0; i < day; i++){
            for(Item item : items){
                item.update();
            }
        }
        for(Item item : items){
            if (item instanceof LegendaryItem){
                System.out.println(item.toStringLeg());
            }
            else {
                System.out.println(item);
            }
        }

        this.repository.SaveInventory(items);
    }
}
