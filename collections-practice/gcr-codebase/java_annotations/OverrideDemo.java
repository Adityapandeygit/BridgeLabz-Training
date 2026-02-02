package collections_practice.gcr_codebase.java_annotations;

class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

public class OverrideDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound();
    }
}
