class OOPSParameterizedConstructor {
    String name;
    int age;

    // 👉 Parameterized Constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void show() {
        System.out.println(name + " " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        // 👉 Using Parameterized Constructor here
        Student s1 = new Student("Ankit", 20);
        Student s2 = new Student("Rahul", 22);

        s1.show(); // Ankit 20
        s2.show(); // Rahul 22
    }
}
