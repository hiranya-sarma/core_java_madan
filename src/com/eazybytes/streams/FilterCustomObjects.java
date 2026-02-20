package com.eazybytes.streams;

import java.util.ArrayList;
import java.util.List;

class Product {
    String name;
    double price;
    String category;

    Product(String name, int price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String toString() {
        return name + " " + price + " " + category;
    }
}

public class FilterCustomObjects {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("Apple", 250, "Fruits"));
        products.add(new Product("TV", 150, "Electronics"));
        products.add(new Product("Jeans", 100, "Clothing"));
        products.add(new Product("Laptop", 120, "Electronics"));


    }
}
