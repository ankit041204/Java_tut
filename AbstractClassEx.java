abstract class Animal {
    abstract void sound();  // abstract method

    void eat() {            // normal method
        System.out.println("Animals eat food");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class AbstractClassEx{
    public static void main(String[] args) {
        Animal a = new Dog(); // You can use reference of abstract class
        a.sound();  // Calls Dog’s method
        a.eat();    // Calls method from Animal class
    }
}
