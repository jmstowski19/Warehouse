package com.company;



public class Item implements Comparable {

    private itemCondition cond;
    private double Mass;
    private String Name;
    private int Quantity;

    public String getName() {
        return Name;
    }

    public double getMass() {
        return Mass;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void addQuantity(Item a){
        this.Quantity+=a.Quantity;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public Item(String a, int b, double c, itemCondition d){
        this.Name=a;
        this.Quantity=b;
        this.Mass=c;
        this.cond=d;
    }

    public void print(){
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
