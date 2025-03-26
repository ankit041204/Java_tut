import java.util.Scanner;

public class Conditions{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        int x = sc.nextInt();

        if(x%2==0){
            System.out.println("The given number is Even");
        }else{
            System.out.println("Not Even");
        }
    }
    
}