import java.util.Stack;

public class StackDuplicateParenthesis {

    public static boolean hasDuplicate(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // If closing bracket
            if (ch == ')') {
                int count = 0;

                while (stack.peek() != '(') {
                    stack.pop();
                    count++;
                }

                stack.pop(); // Remove opening bracket

                if (count <= 1) {
                    return true; // Duplicate found
                }
            } else {
                stack.push(ch);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String str = "((a+b))";

        if (hasDuplicate(str)) {
            System.out.println("Duplicate Parenthesis Found");
        } else {
            System.out.println("No Duplicate Parenthesis");
        }
    }
}
