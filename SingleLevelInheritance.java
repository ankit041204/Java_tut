class GrandParent {
    void method1() {
        System.out.println("GrandParent class");
    }
}

class Parent extends GrandParent {
    void method2() {
        System.out.println("Parent class");
    }
}

class Child extends Parent {
    void method3() {
        System.out.println("Child class");
    }
}

public class SingleLevelInheritance {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.method1(); // From GrandParent
        obj.method2(); // From Parent
        obj.method3(); // From Child
    }
}
