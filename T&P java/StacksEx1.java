import java.util.*;
public class StacksEx1 {

    public static void main (String args[]){
        Stack<String> stack = new Stack<String>();

        stack.push("Ankit");
        stack.push("Vivek");
        stack.push("Deepak");
        stack.push("Rahul");
        stack.push("Aman");

        stack.pop();

        Iterator<String> itr = stack.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}