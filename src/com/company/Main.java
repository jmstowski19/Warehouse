package com.company;

import java.util.HashMap;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Item a = new Item("Jabłko", 50, 5, itemCondition.NEW);
        Item b = new Item("Marchew", 100, 60, itemCondition.NEW);
        Item c = new Item("Arbuz", 43, 6, itemCondition.NEW);
        Item d = new Item("Groch", 12, 23, itemCondition.NEW);
        Item e = new Item("Ziemniak", 45, 12, itemCondition.NEW);
        Item f = new Item("Gruszka", 111, 1, itemCondition.NEW);
        Item g = new Item("Jabłko", 60, 23, itemCondition.NEW);
        Item h = new Item("Gruz", 60, 70, itemCondition.NEW);
        Item i = new Item("Pietruszka", 60, 23, itemCondition.NEW);
        FulfillmentCenter first=new FulfillmentCenter("Nowy", 1000);
        first.addProduct(a);
        first.addProduct(b);
        first.addProduct(c);
        first.addProduct(d);
        first.addProduct(e);
        first.addProduct(f);
        first.addProduct(h);
        first.addProduct(i);
        first.summary();
        System.out.println();



    }
}
