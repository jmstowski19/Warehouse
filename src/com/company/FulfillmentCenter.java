package com.company;

import java.util.*;

public class FulfillmentCenter{

    private String Name;
    private double maxMass;
    private double currentMass;
    private Map<String, Item> itemList = new HashMap<>();


    public FulfillmentCenter(String a, double b){
        this.Name=a;
        this.maxMass=b;
        this.currentMass=0;
    }

    public void getProduct(Item a){
        if(itemList.containsKey(a.getName())){
            if(itemList.get(a.getName()).getQuantity()==0){
                removeProduct(a);
            }
            itemList.get(a.getName()).getOne();
        }
        else{
            System.out.println(System.err);
        }
    }

    public void addProduct(Item a){
        if(currentMass+a.getMass()<=maxMass){
            if(itemList.containsKey(a.getName())){
                itemList.get(a.getName()).addQuantity(a);
                currentMass = currentMass + a.getMass();
            }
            else {
                itemList.put(a.getName(),a);
                currentMass = currentMass + a.getMass();
            }
        }
        else{
            System.out.println(System.err);
        }

    }

    private void removeProduct(Item a){
        itemList.remove(a.getName());
    }

    public List sortByName(){
        List<Item> sortedList = new ArrayList<>(itemList.values());
        Collections.sort(sortedList, Comparator.comparing(Item::getName));
        return sortedList;
    }

    public List sortByAmount(){
        List<Item> sortedList = new ArrayList<>(itemList.values());
        Collections.sort(sortedList, Comparator.comparing(Item::getQuantity));
        return sortedList;
    }

    private void summary(){
        List<Item> ViewList = new ArrayList<>(itemList.values());
        for (Item p : ViewList) {
            p.print();
        }
    }

    private Item max(){
        List<Item> ViewList = new ArrayList<>(itemList.values());
        Collections.max(ViewList, null);
    }

}
