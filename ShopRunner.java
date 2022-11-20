package com.ata;

import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Scanner;
import javax.annotation.Nullable;

/**
 * The ShopRunner class is the main entry point for the application.
 * It encapsulates a Menu, providing it with a Scanner configured
 * with System.in to allow the menu to read from standard in.
 * When the application starts, the menu's greet and show methods are called.
 */
public class ShopRunner {
    /**
     * Main entry point to the application.
     * Asks the menu's greeting to be printed to standard out by calling its greet method.
     * Asks the menu to be shown by calling its show method.
     * @param args Command line arguments to the application
     */
    public static void main(@Nullable String[] args) {
        Menu menu = new Menu(new Scanner(new InputStreamReader(System.in, Charset.forName("UTF-8"))), new Shop());
        
        Shop shop = new Shop(products);
        
        menu.greet();
        menu.executeMenu();
    }
    
    public class Shop {
        String[] products = {"Crew Neck", "V-Neck", "Polo", "Boat Neck", "Tank Top"};
    
    
    public String[] Shop(String[] shopProducts) {
        // Assing passed in strings values to the products list
        products = shopProducts.clone();
    }
         
    
    /**
    *
    * This method prints the current products in the store
    **/
    public void printProducts() {
        System.out.println("--Products--");
        for (int i = 0; i < products.length; i++) {
            System.out.println("ID " + i + ": " + products[i]);
        }
    }
    
    /**
    *
    * This method takes that product given by the user and searches the current product list in the store
    * @param String to search for product
    **/
    int findProduct(String searchText) {
        for (int i = 0; i < products.length; i++) {
            if (searchText.equals(products[i])) {
                return i;
            }
        }
        return (-1);
    }
    
}
}