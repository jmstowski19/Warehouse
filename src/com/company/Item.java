package com.company;



public class Item implements Comparable<Item> {

    private int Quantity;
    private itemCondition cond;
    private double Mass;
    private String Name;


    public itemCondition getCond(){
        return this.cond;
    }

    public int sum(int b){
        b=b+this.getQuantity();
        return b;

    }

    @Override
    public int compareTo(Item o) {
        int compare = Name.compareTo(o.Name);

        if(compare == 0) {
            return compare;
        }
        else {
            throw new IllegalArgumentException("Nic");
        }
    }


    String getName() {
        return Name;
    }

    double getMass() {
        return Mass;
    }

    int getQuantity() {
        return Quantity;
    }

    void addQuantity(Item a){
        this.Quantity=this.Quantity+a.getQuantity();
    }

    void addMass(Item a){ this.Mass=this.Mass+a.getMass();}

    Item(){
        this.Name=null;
        this.Quantity=0;
        this.Mass=0;
        this.cond=null;
    }

    Item(String a, int b, double c, itemCondition d){
        this.Name=a;
        this.Quantity=b;
        this.Mass=c;
        this.cond=d;
    }

    void getOne(){
        this.Quantity-=1;
    }

    void print(){
        System.out.println();
        System.out.print("Name: ");
        System.out.println(Name);
        System.out.print("Quantity: ");
        System.out.println(Quantity);
        System.out.print("Mass: ");
        System.out.println(Mass);
        System.out.print("Condition: ");
        System.out.println(cond);

    }
}
