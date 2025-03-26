import java.util.Scanner;

public class test{
    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);
   int r= System.nextInt();
   int c= System.nextInt();
   int [][]arr=newint[r][c];

   for (int i=0;i<r;i++){
    for(int j=0;j<c;j++){

        arr[i][j] = System.nextInt();
    }
   }
   for (int i=0;i<r;i++){
    for(int j=0;j<r;j++){

        System.out.println(arr[i][j]+" ");
    }
    System.out.println();
   }


    }
}