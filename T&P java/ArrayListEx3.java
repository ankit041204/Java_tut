import java.util.*;
public class ArrayListEx3{
    public static void main (String args[]){

        ArrayList<String>al = new ArrayList<String>();

        al.add("Mango");
        al.add("Apple");
        al.add("Banana");
        al.add("grapes");

        System.out.println("Returning the element:"+al.get(1));

        al.set(1,"Dates");
        for (String fruit:al){

            System.out.println(fruit);
        }
    }
}