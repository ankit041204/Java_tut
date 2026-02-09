import java.io.*;
import java.util.ArrayList;
public class ArrayListDemo{
    public static void main (String args[]){

        ArrayList<Integer>list = new ArrayList<Integer>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("First ArrayList :"+list);
        ArrayList sec_list = new ArrayList();
        sec_list = (ArrayList)list.clone();
        System.out.println("Second ArrayList is :"+list);
    }
}