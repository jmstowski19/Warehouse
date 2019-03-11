package com.company;

import java.util.*;

class FulfillmentCenter {

    private String Name;
    private double maxMass;
    private double currentMass;
    /*private Map<String, Item> itemList = new HashMap<>();*/
    private List<Item> items = new ArrayList<>();



    FulfillmentCenter(String a, double b) {
        this.Name = a;
        this.maxMass = b;
        this.currentMass = 0;
    }

    String getName(){
        return this.Name;
    }

    double getMaxMass() {
        return maxMass;
    }

    double getCurrentMass(){
        return this.currentMass;
    }

    void addProduct(Item a){
        boolean check=false;
        if (currentMass+a.getMass()<=maxMass){
            for(Item p : items){
                if(p.getName()==a.getName()){
                    check=true;
                    p.addQuantity(a);
                    p.addMass(a);
                    this.currentMass+=a.getMass();
                }
            }
            if(check==false){
                items.add(a);
                this.currentMass+=a.getMass();

            }
        }
    }

    void getProduct(Item a){
        boolean check = false;
        for (Item p : items){
            if (p.getName()==a.getName()){
                check=true;
                if(p.getQuantity()==1){
                    removeProduct(p);
                }
                else{
                    p.getOne();
                    currentMass-=a.getMass();
                }
            }
        }

    }

    void removeProduct(Item a){
        currentMass-=a.getMass();
        items.remove(a);
    }



    List sortByName() {
        Collections.sort(items, Comparator.comparing(Item::getName));
        for (Item p : items) {
            p.print();
        }
        return items;

    }

    Item search(String a){
        Item nowy=new Item();
        for (Item p : items){
            if (a.compareTo(p.getName())==0){
                nowy = p;
            }
        }
        return nowy;
    }

    void SearchPartial(String match){
        for (Item p : items) {
            if (p.getName().contains(match)){
                p.print();
            }

        }
    }

    List sortByAmount() {

        Collections.sort(items, Comparator.comparing(Item::getQuantity));
        for (Item p : items) {
            p.print();
        }
        return items;
    }

    void summary() {
        for (Item p : items) {
            p.print();
        }
    }


    int countByCondition(itemCondition a) {

        final int[] add = {0};
        items.forEach(Item -> {
            if (a.equals(Item.getCond())) {
                add[0] = add[0] + Item.getQuantity();
                Item.print();
            }
        });
        return add[0];
    }

    Item max(){
        List<Item> maxList = items;
        Item maximum;
        maximum = Collections.max(maxList, Comparator.comparing(Item::getQuantity));
        maximum.print();
        return maximum;
    }


}


