package com.guildedrose;

import com.guildedrose.entities.Shop;

public class App {

    public static void main(String[] args) {
        Shop shop = new Shop(new inMemoryRepository());
        System.out.println(shop);
    }
}
