public class FunctionsBinToDec{
    public static void binToDec (int binNum){

        int myNum = binNum;
        int pow = 0;
        int decNum =0;

        while (binNum>0){

            int lastDigit = binNum + (lastdigit *(int)Math.pow(2,pow));
            pow++;
            binNum = binNum/10;
        }
        System.out.println("decimal of"+ MyNum +" "+decNum);
    }
    public static void main (String args[]){
        binToDec(101);
    }
}