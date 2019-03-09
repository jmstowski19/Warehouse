package com.company;


import java.util.HashMap;
import java.util.Map;

public class FulfillmentCenter {

    private String Name;
    private double maxMass;
    private double currentMass;
    private Map<String, Item> listOfObjects = new HashMap<>();

    public void addProduct(Item a){
        if(currentMass+a.getMass()<=maxMass){
            if(listOfObjects.containsKey(a.getName())){
                listOfObjects.get(a.getName()).addQuantity(a);
                currentMass += a.getMass();
            }
            else {
                listOfObjects.put(a.getName(),a);
                currentMass += a.getMass();
            }
        }
        else{
            System.out.println(System.err);
        }

    }

    public void removeProduct(Item a){
        listOfObjects.remove(a.getName());
    }

}
