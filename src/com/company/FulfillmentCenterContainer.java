package com.company;

import java.util.HashMap;
import java.util.Map;

public class FulfillmentCenterContainer {
    private Map<String, FulfillmentCenter> CenterContainer= new HashMap<>();
    public FulfillmentCenterContainer(){

    }

    void addCenter(String a, double b){
        FulfillmentCenter abc = new FulfillmentCenter(a, b);
        this.CenterContainer.put(a, abc);
    }

    void removeCenter(String a){
        CenterContainer.remove(a);
    }

    void findEmpty(){
        for(FulfillmentCenter a : CenterContainer.values()){
            if(a.getCurrentMass()==0){
                System.out.println(a.getName());
            }
        }
    }

    void summary(){
        for(FulfillmentCenter a : CenterContainer.values()){
            System.out.println();
            System.out.println(a.getName());
            System.out.println();
            System.out.println((a.getCurrentMass()/a.getMaxMass())*100 + "% of Max Mass");
            System.out.println();
            a.summary();

        }
    }

    FulfillmentCenter getName(String a){
        return CenterContainer.get(a);
    }
}
