public class FunctionsBinCoef{
    public static int binCoef(int n, int r){

        int fact_n = factorial(n); 
        int fact_r = factorial(r);
        int fact_nmr =factorial(n-r);

        int binCoef = fact_n/(fact_r*fact_nmr);

        return binCoef;
}

    public static void main (String args[]){
        System.out.println(binCoef(5,2));
    }
    }
