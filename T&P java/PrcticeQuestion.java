import java.util.Scanner;

public class PrcticeQuestion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int bits = Integer.toBinaryString(N).length();

        int mask = (1 << bits) - 1;

        int result = N ^ mask;

        System.out.println(result);
    }
}