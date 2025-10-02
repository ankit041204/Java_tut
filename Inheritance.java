// Base Class (also called Parent class / Super class)
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Derived Class (also called Child class / Sub class)
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class Inheritance{
    public static void main(String[] args) {
        // Create an object of Dog (Derived Class)
        Dog d = new Dog();

        // Calling method from Base Class (Animal)
        d.eat();  

        // Calling method from Derived Class (Dog)
        d.bark(); 
    }
}
