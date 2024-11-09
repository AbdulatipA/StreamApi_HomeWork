package org.example.StreamMapTask2;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@Getter
public class Employes {
    private String name;
    private int age;
    private double salary;

    @Override
    public String toString() {
        return "Employes: " +"name = " + name + ", age = " + age + ", salary = " + salary;
    }
}







