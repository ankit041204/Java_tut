import java.util.*;
public class HashingHashMapOperations {
    public static void main (String args[]){

        HashMap<String,Integer> hm = new HashMap<>();

        hm.put ("India",100);
        hm.put("China",150);
        hm.put("USA",60);

        System.out.println(hm);
        //To get
        int population = hm.get("India");
        System.out.println(population);

        System.out.println(hm.get("Indonesia"));

        //Contains key

        System.out.println(hm.containsKey("India"));//True
        System.out.println(hm.containsKey("Indonesia"));//False
        
        
    }
}