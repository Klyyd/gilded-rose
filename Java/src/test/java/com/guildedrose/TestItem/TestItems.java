package com.guildedrose.TestItem;

import com.guildedrose.entities.Item;
import com.guildedrose.items.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestItems {

    @Test
    void AgedTest(){
        Item aged = new AgedItem("Aged Item",15,7);
        aged.update();
        // quality
        assertEquals(8,aged.getQuality());
        // sell in
        assertEquals(14,aged.getSellIn());

        Item agedMaxQualityTest = new AgedItem("Aged Item",10,50);
        agedMaxQualityTest.update();
        //quality
        assertEquals(50,agedMaxQualityTest.getQuality());
        //sellin
        assertEquals(9,agedMaxQualityTest.getSellIn());
    }

    @Test
    void ConjuredTest(){
        Item conjured = new ConjuredItem("Conjured Item",8,22);
        conjured.update();
        // quality
        assertEquals(20,conjured.getQuality());
        // sell in
        assertEquals(7,conjured.getSellIn());

        Item conjuredMinQualityTest = new ConjuredItem("Conjured Item",8,1);
        conjuredMinQualityTest.update();
        // quality
        assertEquals(0,conjuredMinQualityTest.getQuality());
        // sell in
        assertEquals(7,conjuredMinQualityTest.getSellIn());
    }

    @Test
    void LegendaryTest(){
        Item legendary = new LegendaryItem("Sulfuras",0,10);
        legendary.update();
        // quality
        assertEquals(80,legendary.getQuality());
        // sell in
        assertEquals(-1,legendary.getSellIn());
    }

    @Test
    void GenericTest(){
        Item generic = new GenericItem("Item normal",15,33);
        generic.update();
        // quality
        assertEquals(32,generic.getQuality());
        // sell in
        assertEquals(14,generic.getSellIn());

        Item genericEndSellInTest = new GenericItem("Item normal",0,33);
        genericEndSellInTest.update();
        // quality
        assertEquals(31,genericEndSellInTest.getQuality());
        // sell in
        assertEquals(-1,genericEndSellInTest.getSellIn());

        Item genericMinQualityTest = new GenericItem("Item normal",0,1);
        genericMinQualityTest.update();
        // quality
        assertEquals(0,genericMinQualityTest.getQuality());
        // sell in
        assertEquals(-1,genericMinQualityTest.getSellIn());
    }

    @Test
    void EventTest(){
        Item event = new EventItem("Backstage passes",23,4);
        event.update();
        // quality
        assertEquals(4,event.getQuality());
        // sell in
        assertEquals(22,event.getSellIn());

        Item eventLessThanOrTenDay = new EventItem("Backstage passes",8,4);
        eventLessThanOrTenDay.update();
        // quality
        assertEquals(6,eventLessThanOrTenDay.getQuality());
        // sell in
        assertEquals(7,eventLessThanOrTenDay.getSellIn());

        Item eventLessThanOrFiveDay = new EventItem("Backstage passes",3,4);
        eventLessThanOrFiveDay.update();
        // quality
        assertEquals(7,eventLessThanOrFiveDay.getQuality());
        // sell in
        assertEquals(2,eventLessThanOrFiveDay.getSellIn());

        Item eventSellInZero = new EventItem("Backstage passes",1,25);
        eventSellInZero.update();
        // quality
        assertEquals(26,eventSellInZero.getQuality());
        // sell in
        assertEquals(0,eventSellInZero.getSellIn());
    }
}
