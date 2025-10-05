class Student {
    int rollNo;
    String name;
    static String school = "Shanti English Medium School"; // static variable

    Student(int r, String n) {
        rollNo = r;
        name = n;
    }

    void show() {
        System.out.println(rollNo + " " + name + " " + school);
    }
}

public class StaticVariableCodeEx {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Ankit");
        Student s2 = new Student(2, "Aman");

        s1.show();
        s2.show();
    }
}
