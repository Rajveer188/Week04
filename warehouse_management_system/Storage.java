package com.tit.week04.day01.generics.warehouse_managment_system;


import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

public class Storage <T extends WarehouseItem>{
    //Attribute
    private List<T> itemList;

    //constructor
    public Storage(){
        itemList = new ArrayList<>();
    }

    //method to add item to list
    public void addItem(T item){
        itemList.add(item);
    }
    //method to get list of item
    public List<T> getItemList(){
        return itemList;
    }

    //method to display all items
    public static void displayItems(List<? extends WarehouseItem> items){
        for (WarehouseItem item : items){
            out.println(item.toString());
        }
    }
}
