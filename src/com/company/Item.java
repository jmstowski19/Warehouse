package com.company;



public class Item implements Comparable<Item> {

    private itemCondition cond;
    private double Mass;
    private String Name;
    private int Quantity;

    @Override
    public int compareTo(Item item) {
        return 0;
    }

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
        this.Quantity=this.Quantity+a.getQuantity();
    }


    public Item(String a, int b, double c, itemCondition d){
        this.Name=a;
        this.Quantity=b;
        this.Mass=c;
        this.cond=d;
    }

    public void getOne(){
        this.Quantity-=1;
    }

    public void print(){
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
