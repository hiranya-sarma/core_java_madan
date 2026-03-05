package com.eazybytes.streams.filter;

import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private double price;
    private String category;

    Product(String name, int price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Product {name=" + name + ", price=" + price + ", category=" + category + "}";
    }
}

public class FilterCustomObjects {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("Apple", 250, "Fruits"));
        products.add(new Product("TV", 150, "Electronics"));
        products.add(new Product("Jeans", 100, "Clothing"));
        products.add(new Product("Laptop", 120, "Electronics"));

        /*
        Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
	at java.base/java.util.stream.AbstractPipeline.<init>(AbstractPipeline.java:203)
	at java.base/java.util.stream.ReferencePipeline.<init>(ReferencePipeline.java:96)
	at java.base/java.util.stream.ReferencePipeline$StatelessOp.<init>(ReferencePipeline.java:800)
	at java.base/java.util.stream.ReferencePipeline$2.<init>(ReferencePipeline.java:167)
	at java.base/java.util.stream.ReferencePipeline.filter(ReferencePipeline.java:166)
	at com.eazybytes.streams.FilterCustomObjects.main(FilterCustomObjects.java:49)

        Stream<Product> streamProduct = products.stream();
        List<Product> productList= streamProduct.filter(product -> product.getCategory().equals("Electronics")).toList();
        System.out.println(productList);
        productList.forEach(product1 -> System.out.println(product1.toString()));

        //Applying multiple filters
        productList= streamProduct.filter(product -> product.getCategory().equals("Electronics")).filter(product -> product.getPrice() < 150).toList();
        System.out.println(productList);

         */
        // First query: Electronics
        List<Product> productList = products.stream()
                .filter(product -> product.getCategory().equals("Electronics"))
                .toList();
        System.out.println(productList);
        productList.forEach(product1 -> System.out.println(product1.toString()));

        // Second query: Electronics with price < 150
        productList = products.stream()
                .filter(product -> product.getCategory().equals("Electronics"))
                .filter(product -> product.getPrice() < 150)
                .toList();
        System.out.println(productList);

    }
}
