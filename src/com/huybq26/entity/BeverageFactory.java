package com.huybq26.entity;
// Created by huybq26 on 5/7/22

public class BeverageFactory {
    public Beverage createBeverage(String type, String name, String description, double price) {
        Beverage beverage;
        if (type.toLowerCase().equals("menu")){
            beverage = new Menu(name, description); // neglect price
            // how to add this menu to the current menuList?
            // In theory, I can move this method to controller. But the code will not be very clean I guess
        }
        else if (type.toLowerCase().equals("bigmenu")){
            beverage = BigMenu.getInstance();
        }
        else{
            beverage = new Item(name, description, price);
        }
        return beverage;
        // how to add this to the current menuList?
    }
}