package com.tit.week04.day01.generics.warehouse_managment_system;

//abstract class to represent warehouse items
public class WarehouseItem {
    //Attribute
    private String itemName;
    private int itemId;

    //constructor
    public WarehouseItem(String itemName, int itemId) {
        this.itemName = itemName;
        this.itemId = itemId;
    }

    //getter
    public String getItemName() {
        return itemName;
    }
    public int getItemId() {
        return itemId;
    }

    @Override
    public String toString() {
        String result = "Name - " + itemName + ", id - " + itemId;
        return result;
    }
}
