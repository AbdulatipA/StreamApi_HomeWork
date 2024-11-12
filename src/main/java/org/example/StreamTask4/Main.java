package org.example.StreamTask4;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        //1.Пропустить первые 2 элемента в стриме чисел и собрать оставшиеся в список.
        int[] numb = {1,2,3,4,5,6,7,8,9,10};
        IntStream stream = Arrays.stream(numb);
        List<Integer> skipList = stream.skip(2)
                .boxed()
                .toList();
//        System.out.println(skipList);


        //2.Из списка списков строк получить плоский список строк,
        // преобразовав каждый элемент в верхний регистр.
        List<String> textList = new ArrayList<>();
        textList.add("Hello");
        textList.add("World");
        textList.add("Java");

        List<String> toUpperCaseList = textList.stream()
                .map(e -> e.toUpperCase())
                .toList();
//        System.out.println(toUpperCaseList);


        //3.Удалить дубликаты из списка строк и получить результат в виде массива строк.
        List<String> dublicateList = new ArrayList<>();
        Collections.addAll(dublicateList, "John", "Yana", "Jack", "John", "Jack", "Anton");
//        dublicateList.add("John");
//        dublicateList.add("Yana");
//        dublicateList.add("Jack");
//        dublicateList.add("John");
//        dublicateList.add("Jack");
//        dublicateList.add("Anton");
        System.out.println(dublicateList);

        List<String> noDublicateList = dublicateList.stream()
                .distinct()
                .toList();
        System.out.println(noDublicateList);


        //4.Разделить список чисел на две группы: четные и нечетные, и получить мапу.
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Map<Boolean, List<Integer>> groupNumbers = numbers.stream()
                .collect(Collectors.groupingBy(e -> e % 2 == 0));

        for (Map.Entry<Boolean, List<Integer>> entry : groupNumbers.entrySet()) {
            List<Integer> list = entry.getValue();
            System.out.println(entry.getKey());

            list.forEach(System.out::println);
        }
    }
}
