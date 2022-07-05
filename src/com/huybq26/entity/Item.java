package com.huybq26.entity;
// Created by huybq26 on 5/7/22

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Item extends Beverage{
    private int id;
    private String name;
    private float price;
    private String description;

    public Item (int id, String name, float price, String description){
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public float getPrice(){
        return price;
    }

    public String getDescription(){
        return description;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPrice(float price){
        this.price = price;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void showDetails(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.id + ", " + this.name + ", " + this.price + "$.");
        sb.append("\n");
        sb.append(this.description);
        sb.append("\n");
        System.out.println(sb.toString());
    }
}