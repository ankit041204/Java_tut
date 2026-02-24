import java.util.Stack;

public class ReverseStringUsingStack {

    public static void main(String[] args) {

        String str = "Placement";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        String reversed = "";
        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversed);
    }
}
//1.write a stack program to find the next greater element for each array element
//input : 4,5,2,25;