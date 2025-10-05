class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class MethodOverridingEx{
    public static void main(String[] args) {
        Animal a = new Dog();  // Reference of parent, object of child
        a.sound();             // Calls Dog's version → "Dog barks"
    }
}
