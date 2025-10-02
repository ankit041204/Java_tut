public class OOPS{
    public static void main (String args[]){
        Student s1 = new Student ("Ankit Dharmendra Singh");
        System.out.println(s1.name);
    }
}
class Student{
    String name;
    int roll;
    Student(String name){
        this.name = name;
    }
}