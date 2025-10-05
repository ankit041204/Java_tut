class Calculator {
    void add(int a, int b) {
        System.out.println(a + b);
    }

    void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }
}

public class MethodOverloadingExCalc{
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.add(10, 20);      // Calls first method
        calc.add(10, 20, 30);  // Calls second method
    }
}
