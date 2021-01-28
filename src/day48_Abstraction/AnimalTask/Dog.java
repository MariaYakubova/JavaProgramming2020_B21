package day48_Abstraction.AnimalTask;

public class Dog extends Animal implements Playable, Swimmable {
    public Dog(String name, String breed, String size, char gender, int age) {
        super(name, breed, size, gender, age);
    }

    @Override
    public void sleep() {

        System.out.println("Dog sleeps 8 hours");
    }

    @Override
    public void play() {
        System.out.println("Dog loves to play");
    }

    @Override
    public void swim() {
        System.out.println("Dog can swim 10 minutes");
    }
}
