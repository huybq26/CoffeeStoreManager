package com.huybq26.entity;
// Created by huybq26 on 5/7/22

import java.util.*;

public class Menu extends Beverage{
    // This is Coffee Menu initially having 3 items: Milk Coffee, Black Coffee, White Coffee
    private List<Beverage> menuList;
    private String name;
    private String description;
    public Menu (String name, String description){
        menuList = new ArrayList<>();
        this.name = name;
        this.description = description;
    }
    public List<Beverage> getItemList(Beverage beverage){
        return menuList;
    }
    public void addItem (Beverage beverage){
        menuList.add(beverage);
    }

    public void removeItem(int index){
        Beverage beverage = menuList.get(index);
        menuList.remove(beverage);
    }


    public void showDetails(){
        System.out.println();
        System.out.println(this.name + " Menu" + " consists of: ");
        for (Beverage beverage: menuList){
            // delegate for item to implement
//            System.out.println(menuList.size());
            beverage.showDetails();
        }
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDescription(String description){
        this.description = description;
    }
}