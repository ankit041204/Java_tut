class Student {
    int rollNo;
    String name;
    Student next;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
        this.next = null;
    }
}

public class StudentEnrollment {

    static Student head = null;
    public static void addStudent(int rollNo, String name) {
        Student newStudent = new Student(rollNo, name);

        if (head == null) {
            head = newStudent;
        } else {
            Student temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newStudent;
        }
    }

    public static void displayStudents() {
        Student temp = head;
        while (temp != null) {
            System.out.println("Roll No: " + temp.rollNo + ", Name: " + temp.name);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        addStudent(174, "Ankit");
        addStudent(78, "Krishna");
        addStudent(48, "Deepak");

        System.out.println("Student List:");
        displayStudents();
    }
}