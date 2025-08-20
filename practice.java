import java.util.Scanner;
public class practice{
    public static void main(String args[]){
        int n=182368;
        while(n>0){

            int lastDigit = n%10;
            System.out.print(lastDigit+" ");

            n=n/10;
        }
        System.out.println();
  
    }
}