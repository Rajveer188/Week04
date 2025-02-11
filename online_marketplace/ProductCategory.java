package com.tit.week04.day01.generics.online_marketplace;

public abstract class ProductCategory {
    //Attribute
    private String productName;
    private double productPrice;

    //constructor
    public ProductCategory(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    //method to get price of product
    public  double getPrice(){
        return productPrice;
    }
    //method to set price
    public void setPrice(double productPrice) {
        this.productPrice = productPrice;
    }
    //override toString method to return product details
    @Override
    public String toString() {
        String productDetails = "product name - " + productName +
                ", price - " + productPrice;
        return productDetails;
    }
}
