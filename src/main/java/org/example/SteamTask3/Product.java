package org.example.SteamTask3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@Getter
@ToString
public class Product {
    private String name;
    private double price;
    private int quantity;
    private boolean available;
}
