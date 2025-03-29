import java.util.Scanner;

public class test{
    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int [][]arr = new int [n][n];

   for (int i=0;i<n;i++){
    for (int j=0;j<n;j++){
        arr[i][j] =sc.nextInt();
    }
   } 
   for (int i=0;i<n;i++){
    for (int j=0;j<n;j++){

        if (i==j){

            System.out.println (a[i][j]+" ");

        }
    }
    for (int i=0;i<n;i++){
        for (int j=0;j<n;j++){

            if (i+j==n-1){

                System.out.println(a [i][j]+" ");
            }
        }
    }
   }
}
}
