public class Functions5{
    public static boolean isprime(int n){
        boolean isPrime = true;
        for (int i=2;i<=n;i++){

            if (n%i==0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    public static void main(String args[]){
        System.out.println(isprime(5));
    }
}