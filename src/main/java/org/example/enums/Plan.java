package org.example.enums;

public enum Plan {
    BASIC("Basic Plan",100),
    SILVER("Silver Plan",200),
    PLATINUM("Platinum Plan",300);

    private final String name;
    private final int price;

    //Constructor
    Plan(String name,int price){
        this.name=name;
        this.price=price;
    }
    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }
}
