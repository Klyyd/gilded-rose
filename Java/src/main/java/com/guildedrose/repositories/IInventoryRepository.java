package com.guildedrose.repositories;

import com.guildedrose.entities.Item;

import java.util.ArrayList;

public interface IInventoryRepository {

    ArrayList<Item> GetInventory();

    void SaveInventory(ArrayList<Item> items);
}
