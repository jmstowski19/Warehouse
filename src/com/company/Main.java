package com.company;

import java.util.HashMap;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Item a = new Item("Jabłko", 50, 5, itemCondition.NEW);
        Item b = new Item("Marchew", 100, 60, itemCondition.USED);
        Item c = new Item("Arbuz", 43, 6, itemCondition.NEW);
        Item d = new Item("Groch", 12, 23, itemCondition.USED);
        Item e = new Item("Ziemniak", 45, 12, itemCondition.REFURBISHED);
        Item f = new Item("Gruszka", 1, 10, itemCondition.NEW);
        Item g = new Item("Jabłko", 60, 23, itemCondition.NEW);
        Item h = new Item("Gruz", 60, 70, itemCondition.REFURBISHED);
        Item i = new Item("Pietruszka", 60, 23, itemCondition.REFURBISHED);
        FulfillmentCenterContainer Polska = new FulfillmentCenterContainer();
        Polska.addCenter("Kraków", 700);
        Polska.addCenter("Warszawa", 1000);
        Polska.addCenter("Poznań", 500);
        Polska.getName("Kraków").addProduct(a);
        Polska.getName("Kraków").addProduct(g);
        Polska.getName("Kraków").addProduct(h);
        Polska.getName("Kraków").addProduct(i);
        Polska.getName("Kraków").getProduct(a);
        Polska.getName("Warszawa").addProduct(c);
        Polska.getName("Warszawa").addProduct(d);
        Polska.getName("Warszawa").addProduct(e);
        System.out.println("*************************Search*************************");
        Polska.getName("Kraków").search("Jabłko").print();
        System.out.println("*************************Partial Search*************************");
        Polska.getName("Kraków").SearchPartial("ka");
        System.out.println("*************************Summary*************************");
        Polska.getName("Warszawa").summary();
        System.out.println();
        System.out.println();
        System.out.println("*************************Count by condition*************************");
        int g1=Polska.getName("Kraków").countByCondition(itemCondition.USED);
        System.out.println();
        System.out.println();
        System.out.print("Quantity: ");
        System.out.println(g1);
        System.out.println();
        System.out.println("*************************Sorted by Name*************************");
        Polska.getName("Kraków").sortByName();
        System.out.println("*************************Sorted by Quantity*************************");
        Polska.getName("Warszawa").sortByAmount();
        System.out.println();
        System.out.println("*************************max function*************************");
        Polska.getName("Warszawa").max();
        System.out.println();
        System.out.println("*************************Find Empty()*************************");
        Polska.findEmpty();
        System.out.println();
        System.out.println("*************************Remove Center*************************");
        Polska.removeCenter("Poznań");
        System.out.println();
        System.out.println("*************************Fulfillment center container summary*************************");
        Polska.summary();

    }
}
