package day48_Abstraction.AnimalTask;

public class Eagle extends Animal {
    public Eagle(String name, String breed, String size, char gender, int age) {
        super(name, breed, size, gender, age);
    }

    @Override
    public void sleep() {

    }
    @Override
    public void hunt() {
        System.out.println("Eagle hunts snake");
    }

    @Override
    public void fly() {
        System.out.println("Eagle can fly long hours");
    }


    }

