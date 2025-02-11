package com.tit.week04.day01.generics.warehouse_managment_system;

import java.lang.invoke.CallSite;
import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

//class to operate smart warehouse management system
public class SmartWarehouseSystem {
    public static void main(String[] args) {
        //create electronics item and store them in storage list
        Storage<Electronics> electronicsStorage = new Storage<>();

        Electronics mobileElectronics = new Electronics("Mobile", 101);
        Electronics laptopElectronics = new Electronics("Laptop", 202);

        electronicsStorage.addItem(mobileElectronics);
        electronicsStorage.addItem(laptopElectronics);

        //create Groceries item and store them in storage list
        Storage<Groceries> groceriesStorage = new Storage<>();

        Groceries riceGroceries = new Groceries("Rice", 11);
        Groceries saltGroceries = new Groceries("salt", 22);

        groceriesStorage.addItem(riceGroceries);
        groceriesStorage.addItem(saltGroceries);

        //create furniture item and store them in storage list
        Storage<Furniture> furnitureStorage = new Storage<>();

        Furniture sofaFurniture = new Furniture("Sofa", 12);
        Furniture deskFurniture = new Furniture("Desk", 14);

        furnitureStorage.addItem(sofaFurniture);
        furnitureStorage.addItem(deskFurniture);

        //display all item
        out.println("Electronics item -");
        Storage.displayItems(electronicsStorage.getItemList());
        out.println("\nFurniture item -");
        Storage.displayItems(furnitureStorage.getItemList());
        out.println("\ngroceries item -");
        Storage.displayItems(groceriesStorage.getItemList());
    }
}
