class student{

    string name;
    int rollno;
    int marks;

}
class main{
    public static void main(String []args){
        Student s= new Student();
        s.name="Ankit";
        s.rollno=50;
        s.marks=90;
        System.out.print(s.name+" "+s.rollno+" "+s.marks);

        Student s1 = new Student();
        s1.name = "Aman";
        s1.rollno =55;
        s1.marks = 85;
    }
}