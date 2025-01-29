import java.util.Scanner;

public class inputfunctions{
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter two numbers");
        double n1,n2,n3;

        n1 = sc.nextDouble();
        n2 = sc.nextDouble();
        n3 = n1 + n2;

        System.out.println("Total ="+n3);
    }
}
