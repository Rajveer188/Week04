package com.tit.week04.day01.generics.online_marketplace;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

public class Product<T>{
    //Attribute
    List<T> productList;

    //constructor
    public Product(){
        productList = new ArrayList<>();
    }

    //method to add product to list
    public void addProduct(T product){
        productList.add(product);
    }
    //generic method to apply discount on product
    public static <T extends ProductCategory> void applyDiscount(T product, double percentage){
        //get current price
        double currentPrice = product.getPrice();

        //apply discount
        double discountedPrice = currentPrice - (currentPrice*percentage/100);
        //set discounted price
        product.setPrice(discountedPrice);
    }
    //method to access product list
    public List<T> getProductList(){
        return productList;
    }
    //method to display product details
    public static void displayProduct(List<? extends ProductCategory> productCategories){
        for(ProductCategory product : productCategories){
            out.println(product.toString());
        }
    }
}
