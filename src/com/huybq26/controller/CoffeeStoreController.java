package com.huybq26.controller;
// Created by huybq26 on 5/7/22

import com.huybq26.entity.Beverage;
import com.huybq26.entity.BeverageFactory;
import com.huybq26.entity.BigMenu;
import com.huybq26.entity.Menu;

import java.util.ArrayList;
import java.util.List;

public class CoffeeStoreController {
    private List<Beverage> menuList; // List of all menus, regardless of where they are located
    private List<Beverage> allList; // List of both items and menus

    public CoffeeStoreController(){
        menuList = new ArrayList<>();
        allList = new ArrayList<>();
    }

    public Beverage createBeverage(String type, String name, String description, double price){
        BeverageFactory factory = new BeverageFactory();
        Beverage beverage = factory.createBeverage(type, name, description, price);
        if (type.toLowerCase().equals("menu") || type.toLowerCase().equals("bigmenu")) menuList.add(beverage);
        allList.add(beverage);
        return beverage;
    }


    public void addMenu(Menu menu){
        // can we wrap the menu creation in a factory?
        this.menuList.add(menu);
    }

    public List<Beverage> getMenuList(){
        return menuList;
    }

    public void addItem(int index, Beverage child) {
        // need to be transparent with customer about menu/item.
        // Need to generate a list of menu, and add item to the chosen menu
        // But that also means that we are breaking the rules of treating everything transparently
        // How about I still add that, but at the main method? (i.e. the menu list)
        // No, must add that in the controller. You don't want to retrieve the list from the view right?
        // Then creating a list in the controller will do the work.
        Beverage parent = menuList.get(index);
        try {
            parent.addItem(child);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // subclass will handle the addition for you. No need to worry.
    }


    public void removeItem(int indexOfParent, int indexToDelete) {
        // how to removeItem from command line?
        // list the item with index starting from 1.
        Beverage parent = menuList.get(indexOfParent);
        try {
            parent.removeItem(indexToDelete);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void showAllItemsDetails(){
        BigMenu.getInstance().showDetails();
    }

    public void showAllMenus(){
        int i=0;
        for (Beverage menu:menuList){
            // getting error here after removing and show, since menuList is not informed when removing item.
            System.out.println(i+1 + ", " + menu.getName());
            i++;
        }
    }

    public void showItemsFromMenu(int index){
        Beverage menu = menuList.get(index);
        List<Beverage> list = menu.getItemList();
        int i=0;
        for (Beverage item:menuList){
            System.out.println(i+1 + ", " + item.getName());
            i++;
        }
    }

}