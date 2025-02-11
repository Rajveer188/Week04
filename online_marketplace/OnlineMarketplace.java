package com.tit.week04.day01.generics.online_marketplace;

import static java.lang.System.out;

public class OnlineMarketplace {
    public static void main(String[] args) {
        Product<BookCategory> bookCategory = new Product<>();
        BookCategory sunshineBook = new BookCategory("Sunshine", 250);
        bookCategory.addProduct(sunshineBook);

        Product<ClothingCategory> clothingCategory = new Product<>();
        ClothingCategory jeansCloth = new ClothingCategory("Jeans", 1750);
        clothingCategory.addProduct(jeansCloth);

        Product<GadgetCategory> gadgetCategory = new Product<>();
        GadgetCategory psGadget = new GadgetCategory("Play station", 60000);
        gadgetCategory.addProduct(psGadget);

        //apply discount to product
        Product.applyDiscount(sunshineBook, 10);
        Product.applyDiscount(jeansCloth, 15);
        Product.applyDiscount(psGadget, 5);

        // display product
        out.println("Books - ");
        Product.displayProduct(bookCategory.getProductList());
        out.println("\ncloths - ");
        Product.displayProduct(clothingCategory.getProductList());
        out.println("\nGadgets - ");
        Product.displayProduct(gadgetCategory.getProductList());
    }
}
