package org.example.StreamMapTask2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employes> employes = new ArrayList<Employes>();

        employes.add(new Employes("Alex", 24, 30000));
        employes.add(new Employes("Yana", 21, 120000));
        employes.add(new Employes("John", 32, 35000));
        employes.add(new Employes("Joshua", 40, 30000));
        employes.add(new Employes("Jaden", 32, 35000));
        employes.add(new Employes("Patrick", 55, 11000));
        employes.add(new Employes("David", 41, 72000));
        employes.add(new Employes("Xavier", 44, 90000));
        employes.add(new Employes("Richard", 38, 25000));
        employes.add(new Employes("Seth", 26, 28000));

        employes.stream()
                .map(e -> {
                    if (e.getSalary() < 40000) {
                    e.setSalary(e.getSalary() + 5000);}
                    return e;
                })
                .toList();

        for (Employes employe : employes) {
            System.out.println(employe);
        }
    }
}






