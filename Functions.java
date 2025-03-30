import java.util.Scanner;

public class Functions{

    public static void main(String args[]){

        Scanner sc = new Scanner (System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int product = a*b*c;
        

        System.out.println("Product of three numbers is:" +product);

    }
}