import java.util.Scanner;
public class Arrays1{
    public static void main(String args[]){
        int marks[] = new int[100];

        Scanner sc = new Scanner (System.in);

        marks[0] =sc.nextInt();
        marks[1] =sc.nextInt();
        marks[2] =sc.nextInt();

        System.out.println("Physics:" +marks[0]);
        System.out.println("Chemistry:" +marks[1]);
        System.out.println("Maths:" +marks[2]);

        int percentage = (marks[0]+marks[1]+marks[2])/3;

        System.out.println("percentage ="+percentage+"%");

    }
}