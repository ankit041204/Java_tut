class RecursionFactorialEx{
    static void printNumbers(int n) {
        if (n == 0)  // Base case
            return;
        printNumbers(n - 1);  // Recursive call
        System.out.println(n);
    }

    public static void main(String[] args) {
        printNumbers(5);
    }
}
