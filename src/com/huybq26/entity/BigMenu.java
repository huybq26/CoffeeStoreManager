package com.huybq26.entity;
// Created by huybq26 on 5/7/22

import java.util.*;

public class BigMenu extends Beverage {
    // Singleton since there should only be one instance of bigMenu
    // This is the root of the composite tree
    // Initially, consist of 3 smaller menus: Coffee, Tea and Freeze
    // Will add them later in the main method
    private static BigMenu bigMenu;
    private String name = "Big Menu";
    private List<Beverage> bigList = new ArrayList<>();

    private BigMenu(){ }

    public static BigMenu getInstance(){
        if (bigMenu == null){
            bigMenu = new BigMenu();
        }
        return bigMenu;
    }
    public void addItem (Beverage beverage){
        bigList.add(beverage);
    }

    public void removeItem(Beverage beverage){
        bigList.remove(beverage);
    }

    public void showDetails(){
        System.out.println("Big Menu: ");
        for (Beverage beverage: bigList){
            // delegate for item to implement
            beverage.showDetails();
        }
    }

    public String getName(){
       return this.name;
    }
}