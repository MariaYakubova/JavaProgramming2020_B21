package day41_Encapsulation;

import java.time.LocalDate;

public class Person {

    private String name;
    private int age;  // final means constant
    private final char gender; // final means constant
    private final LocalDate BOD; // final means constant

    public Person(String name, int age, char gender, LocalDate BOD) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.BOD = BOD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getBOD() {
        return BOD;
    }
}