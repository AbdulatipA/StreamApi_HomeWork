package org.example.StreamMapTask1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> listNumbers = new ArrayList<Integer>();

        listNumbers.add(1);
        listNumbers.add(2);
        listNumbers.add(3);

        List<Integer> newListNumbers = listNumbers.stream()
                .map(listNumber -> listNumber + 50)
                .toList();

        for (Integer listNumber : newListNumbers) {
            System.out.println(listNumber);
        }
    }
}



