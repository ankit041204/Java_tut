import java.util.*;

public class RemoveIfMethod2{
    public static void main (String args[]){

        ArrayList<String>names = new ArrayList<String>();

        names.add("Ankit");
        names.add("Aman");
        names.add("Rahul");

        names.removeIf( n->(n.charAt(0)=='R'));

        for (String i:names){

            System.out.println(i);

        }
    }
}