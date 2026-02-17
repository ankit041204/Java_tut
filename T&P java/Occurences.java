import java.util.*;
import java.util.ArrayList;
public class Occurences{
    public static void main (String args[]){
        List<String>list = new ArrayList<>(Arrays.asList("Apple","Banana","Apple","Orange","Apple"));
        int count = Collections.frequency(list,"Apple");

        
        System.out.println("Counting of Apple:" + count);
    }
}