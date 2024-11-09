package org.example.SteamTask3;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;



public class Main {
    public static void main(String[] args) {
        Product product = new Product("Молоко", 125.7, 1200, false);
        Product product2 = new Product("Сахар", 68.9, 35, true);
        Product product3 = new Product("Хлеб", 15, 0, false);
        Product product4 = new Product("Мука", 78.6, 13, true);
        Product product5 = new Product("Масло", 268.9, 85, true);


        List<Product> products = new ArrayList<>();
        products.add(product);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);

        //доступный товар
        List<Product> availableProducts = products.stream()
                .filter(p -> p.isAvailable())
                .toList();
        for (Product p : availableProducts) {
            System.out.println("Доступный товар: " + p.getName());
        }

        System.out.println("---------------");

        //общая стоимость всех товаров
        List<Double> allPriceProduct = products.stream()
                .map(p -> p.getPrice() * p.getQuantity())
                .toList();
        double price = 0;
        for (double p : allPriceProduct) {
            price += p;
        }
        System.out.println("Общая цена товаров: " + price);


        //Список дорохих товаров
        String expensiveProduct = products.stream()
                .filter(p -> p.getPrice() > 100)
                .map(p -> p.getName())
                .collect(Collectors.joining(", "));
        System.out.println("Товар дороже 100: " + expensiveProduct);


        //Средняя цена доступных товаров
        OptionalDouble averagePrice = products.stream()
                .filter(p -> p.isAvailable())
                .mapToInt(p -> (int) p.getPrice())
                .average();
        if (averagePrice.isPresent()) {
            System.out.println("Средняя цена доступных товаров: " + averagePrice.getAsDouble());
        }


        //Список округленных цен
        List<Long> roundList = products.stream()
                .map(p -> Math.round(p.getPrice()))
                .toList();
        System.out.println("Список округленных цен: " + roundList);
    }
}