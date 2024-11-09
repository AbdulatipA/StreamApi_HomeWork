package org.example.Stream;

import org.example.FunctionalInterface.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("1", "milk",100));
        products.add(new Product("2", "watermelon",222.8));
        products.add(new Product("3", "melon",35.9));
        products.add(new Product("4", "bread",100));
        products.add(new Product("5", "snickers",78.1));
        products.add(new Product("6", "chips",20));
        products.add(new Product("7", "cookies",291.7));
        products.add(new Product("8", "chocolate",64));
        products.add(new Product("9", "candy",355.9));
        products.add(new Product("10", "crackers",12.1));

        List<Product> filterProductPrice = products.stream()
                .filter(e -> e.getPrice() > 200.0)
                .toList();

        List<Product> filterProductName = products.stream()
                .filter(e -> e.getName().startsWith("c") || e.getName().startsWith("C"))
                .toList();

        List<Product> filterProduct = products.stream()
                .filter(e -> e.getPrice() == 100.0)
                .toList();

//        filterProductPrice.forEach(product -> System.out.println(product));
//        filterProductName.forEach(product -> System.out.println(product));
        filterProduct.forEach(product -> System.out.println(product));
    }
}
