import java.util.*;
public class LinkedListReverse {

    public static void main (String args[]){
        LinkedList<String> ll = new LinkedList<String>();

        ll.add("Ankit");
        ll.add("Krishna");
        ll.add("deepak");

        Iterator i = ll.descendingIterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }

    
}
