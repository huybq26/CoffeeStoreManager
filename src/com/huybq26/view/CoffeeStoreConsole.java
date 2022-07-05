package com.huybq26.view;
// Created by huybq26 on 5/7/22

import com.huybq26.controller.CoffeeStoreController;
import com.huybq26.entity.*;

import java.util.List;
import java.util.Scanner;

public class CoffeeStoreConsole {
    Scanner sc;
    CoffeeStoreController controller;
    public CoffeeStoreConsole(){
        controller = new CoffeeStoreController();
        sc = new Scanner(System.in);
    }

    private int menu(){
        System.out.println("---Coffee Store Management App---");
        System.out.println("1. Show menu details");
        System.out.println("2. Add beverage to menu");
        System.out.println("3. Remove beverage from menu");
        System.out.println("0. Exit");
        int choice = sc.nextInt();
        return choice;
    }

    public void start(){

        Beverage bigMenu = controller.createBeverage("bigmenu", "bigmenu", "Big Menu", 0);
//        Beverage coffeeMenu = controller.createBeverage("menu", "Coffee", "Menu with all Coffees", 0);
//        bigMenu.addItem(coffeeMenu);
//        coffeeMenu.addItem(controller.createBeverage("item", "Milk Coffee", "Delicious Milk Coffee", 2.7));
//        coffeeMenu.addItem(controller.createBeverage("item", "Black Coffee", "Delicious Black Coffee", 2.5));
//        controller.showAllItemsDetails();
//        controller.removeItem(0, 1);
//        controller.showAllItemsDetails();

        while (true) {
            int choice = menu();
            switch (choice) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    showMenuDetails();
                    break;
                case 2:
                    addBeverageToMenu();
                    break;
                case 3:
                    removeBeverageFromMenu();
                    break;
                default:
                    throw new AssertionError();
            }
            System.out.println();
        }
    }

    public void showMenuDetails(){
        controller.showAllItemsDetails();
    }

    public void removeBeverageFromMenu(){
        controller.showAllMenus();
        System.out.println("Please choose the index of the menu you want to remove item from: ");

        try{
            int menuIndex = sc.nextInt()-1;
            showItemsFromMenu(menuIndex);
            System.out.println("Please choose the index of the item you want to delete: ");
            int itemIndex = sc.nextInt()-1;
            // later add option 0 for break (twice)
            controller.removeItem(menuIndex, itemIndex);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void addBeverageToMenu(){
        controller.showAllMenus();
        System.out.println("Please choose the index of the menu you want to add item to: ");

        try{
            int menuIndex = sc.nextInt()-1;
            sc.nextLine();
            System.out.println("Do you want to add new menu or new item? (key 'menu' or 'item'): ");
            String type = sc.nextLine();
            System.out.print("\nPlease key in the name of this menu/beverage: ");
            String name = sc.nextLine();
            System.out.println("\nPlease key in the price of this beverage. If menu, input 0: ");
            Double price = sc.nextDouble();
            sc.nextLine();
            System.out.println("\nPlease key in description, if any: ");
            String description = sc.nextLine();
            // later add option -1 for break (twice)
            controller.addItem(menuIndex, controller.createBeverage(type, name, description, price));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void showItemsFromMenu(int index){
        controller.showItemsFromMenu(index);
    }


}