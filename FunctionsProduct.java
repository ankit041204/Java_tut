public class FunctionsProduct{

    public static int multiply (int a, int b){
        int product = a*b;
        return product;
    }
    public static void main(String args[]){

        int a =9;
        int b =8;
        int product =  multiply(a,b);
        System.out.println("a*b="+product);
    }
}