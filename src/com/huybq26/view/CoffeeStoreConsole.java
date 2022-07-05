package com.huybq26.view;
// Created by huybq26 on 5/7/22

import com.huybq26.controller.CoffeeStoreController;
import com.huybq26.entity.*;

public class CoffeeStoreConsole {
    public CoffeeStoreConsole(){

    }

    public void start(){
        CoffeeStoreController controller = new CoffeeStoreController();
        Beverage bigMenu = controller.createBeverage("bigmenu", "bigmenu", "Big Menu", 0);
        Beverage coffeeMenu = controller.createBeverage("menu", "Coffee", "Menu with all Coffees", 0);
        bigMenu.addItem(coffeeMenu);
        coffeeMenu.addItem(controller.createBeverage("item", "Milk Coffee", "Delicious Milk Coffee", 2.7));
        coffeeMenu.addItem(controller.createBeverage("item", "Black Coffee", "Delicious Black Coffee", 2.5));
        controller.showAllItemsDetails();
        controller.removeItem(0, 1);
        controller.showAllItemsDetails();
    }

}