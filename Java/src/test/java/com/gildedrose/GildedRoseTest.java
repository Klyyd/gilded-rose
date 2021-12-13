package com.gildedrose;

import com.guildedrose.entities.Item;
import com.guildedrose.items.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void testSellInAndQualityAgedItem() {
        AgedItem agedItem = new AgedItem("Aged Brie", 5, 8);
        agedItem.update();

        // Test SellIn
        assertEquals(4, agedItem.getSellin());

        // Test Quality
        assertEquals(9, agedItem.getQuality());
    }

    @Test
    void testMaxQualityAgedItem() {
        AgedItem agedItem = new AgedItem("Aged Brie", 10, 50);
        agedItem.update();

        assertEquals(50, agedItem.getQuality());
    }

    @Test
    void testSellInAndQualityConjuredItem() {
        ConjuredItem conjuredItem = new ConjuredItem("Conjured", 10, 15);
        conjuredItem.update();

        // Test SellIn
        assertEquals(9, conjuredItem.getSellin());

        // Test Quality
        assertEquals(13, conjuredItem.getQuality());
    }

    @Test
    void testMinQualityConjuredItem() {
        ConjuredItem conjuredItem = new ConjuredItem("Conjured", 10, 1);
        conjuredItem.update();

        assertEquals(0, conjuredItem.getQuality());
    }

    @Test
    void testSellInAndQualityLegendayItem() {
        LegendaryItem legendaryItem = new LegendaryItem("Sulfuras", 10, 15);
        legendaryItem.update();

        // Test SellIn
        assertEquals(10, legendaryItem.getSellin());

        // Test Quality
        assertEquals(15, legendaryItem.getQuality());
    }

    @Test
    void testSellInAndQualityGenericItem() {
        GenericItem genericItem = new GenericItem("normal Item", 7, 8);
        genericItem.update();

        // Test SellIn
        assertEquals(6, genericItem.getSellin());

        // Test Quality
        assertEquals(7, genericItem.getQuality());
    }

    @Test
    void testQualityIfSellInNegative() {
        GenericItem genericItem = new GenericItem("normal Item", 0, 6);
        genericItem.update();

        // Test SellIn
        assertEquals(-2, genericItem.getSellin());

        // Test Quality
        assertEquals(5, genericItem.getQuality());
    }

    @Test
    void testSellInAndQualityEventItem() {
        EventItem eventItem = new EventItem("Backstage passes", 15, 30);
        eventItem.update();

        // Test SellIn
        assertEquals(14, eventItem.getSellin());

        // Test Quality
        assertEquals(31, eventItem.getQuality());
    }

    @Test
    void testQualityWhenSellInBetween10And5() {
        EventItem eventItem = new EventItem("Backstage passes", 8, 15);
        eventItem.update();

        assertEquals(16, eventItem.getQuality());
    }

    @Test
    void testQualityWhenSellInBetween5And0() {
        EventItem eventItem = new EventItem("Backstage passes", 4, 17);
        eventItem.update();

        assertEquals(18, eventItem.getQuality());
    }

    @Test
    void testQualityWhenSellInInf0() {
        EventItem eventItem = new EventItem("Backstage passes", 0, 30);
        eventItem.update();

        // Test SellIn
        assertEquals(-1, eventItem.getSellin());

        // Test Quality
        assertEquals(31, eventItem.getQuality());
    }
}
