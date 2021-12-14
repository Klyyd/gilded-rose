package com.guildedrose;

import com.guildedrose.repositories.inMemoryRepository;
import java.io.IOException;

public class App {

    public static void main(String[] args) {

        Shop shop = new Shop(new inMemoryRepository());
        shop.UpdateQuality(3);

    }

}
