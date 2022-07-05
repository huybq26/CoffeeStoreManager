package com.huybq26.entity;
// Created by huybq26 on 5/7/22

import java.util.*;

public class BigMenu extends Beverage {
    // This is the root of the composite tree
    // Initially, consist of 3 smaller menus: Coffee, Tea and Freeze
    // Will add them later in the main method
    private List<Beverage> bigList;

    public BigMenu(){
        bigList = new ArrayList<>();
    }
    public void addItem (Beverage beverage){
        bigList.add(beverage);
    }

    public void removeItem(Beverage beverage){
        bigList.remove(beverage);
    }

    public void showDetails(){
        System.out.println("Big Menu" + " consists of: ");
        for (Beverage beverage: bigList){
            // delegate for item to implement
            beverage.showDetails();
        }
    }
}