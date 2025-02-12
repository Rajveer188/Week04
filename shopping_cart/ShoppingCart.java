package com.tit.week04.day02.shopping_cart;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ShoppingCart {
    private HashMap<String, Double> productPrices = new HashMap<>();
    private LinkedHashMap<String, Double> cart = new LinkedHashMap<>();
    private TreeMap<Double, String> sortedCart = new TreeMap<>();

    //method to add product
    public void addProduct(String product, double price) {
        productPrices.put(product, price);
        cart.put(product, price);
    }
    //method to display cart
    public void displayCart() {
        System.out.println("\nitems in  cart");
        for (Map.Entry<String, Double> entry : cart.entrySet()) {
            System.out.println("product " + entry.getKey() + ", price " + entry.getValue());
        }
    }
    //method to display items sorted by price
    public void displaySortedPrice() {
        //add product to treemap
        for (Map.Entry<String, Double> entry : cart.entrySet()) {
            sortedCart.put(entry.getValue(), entry.getKey());
        }
        System.out.println("\nsorted by price-");
        for (Map.Entry<Double, String> entry : sortedCart.entrySet()) {
            System.out.println("product- " + entry.getValue() + ", price- " + entry.getKey());
        }
    }

    public static void main(String[] args) {
        //create shoping cart object
        ShoppingCart cart = new ShoppingCart();

        //add products
        cart.addProduct("apple", 150);
        cart.addProduct("banana", 40);
        cart.addProduct("cherry", 100);

        // display items in the order added
        cart.displayCart();

        //display items sorted by price
        cart.displaySortedPrice();
    }
}

