package com.huybq26.entity;
// Created by huybq26 on 4/7/22

public abstract class Beverage {
    // composite pattern
    // composite:
    public void addItem(Item item){
        throw new UnsupportedOperationException();
    }
    public void removeItem(Item item){
        throw new UnsupportedOperationException();
    }
    public void showMenu(){
        throw new UnsupportedOperationException();
    }

    // item:
    public int getId(){
        throw new UnsupportedOperationException();
    }
    public String getName(){
        throw new UnsupportedOperationException();
    }
    public float getPrice(){
        throw new UnsupportedOperationException();
    }
    public String getDescription(){
        throw new UnsupportedOperationException();
    }

    public void setId(){
        throw new UnsupportedOperationException();
    }
    public void setName(){
        throw new UnsupportedOperationException();
    }
    public void setPrice(){
        throw new UnsupportedOperationException();
    }
    public void setDescription(){
        throw new UnsupportedOperationException();
    }
    public void showDetails(){
        throw new UnsupportedOperationException();
    }
}