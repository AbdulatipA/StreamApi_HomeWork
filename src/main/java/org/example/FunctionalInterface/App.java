package org.example.FunctionalInterface;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class App {
    public static void main( String[] args ) {
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

        List<Product> newProducts = filterProducts(products, product -> product.getPrice() > 200.0);
        List<Product> newProducts2 = filterProducts(products, product -> product.getPrice() == 100.0);
        List<Product> newProducts3 = filterProducts(products, product -> product.getName().startsWith("C") || product.getName().startsWith("c"));

        printProduct(newProducts3);
    }

    static List<Product> filterProducts(List<Product> products, Predicate<Product> predicate){
        List<Product> filteredProducts = new ArrayList<>();
        for (Product product : products) {
            if(predicate.test(product)){
                filteredProducts.add(product);
            }
        }
        return filteredProducts;
    }

    static void printProduct(List<Product> products){
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
