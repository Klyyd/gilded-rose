package com.guildedrose;

import com.guildedrose.entities.Item;

import java.util.ArrayList;
import java.util.List;

public interface IInventoryRepository {

    ArrayList<Item> GetInventory();

    void SaveInventory(ArrayList<Item> items);
}
