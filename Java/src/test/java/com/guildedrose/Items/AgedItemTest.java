package com.guildedrose.Items;

import com.guildedrose.entities.Item;
import com.guildedrose.items.AgedItem;
import org.junit.jupiter.api.Test;

class AgedItemTest {

    @Test
    void update() {
        Item aged = new AgedItem("Aged Item",15,7);
    }
}
