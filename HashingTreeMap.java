import java.util.*;
public class HashingTreeMap {

    public static void main (String args[]){
        TreeMap<String, Integer> tm = new TreeMap<>();

        tm.put("India",100);
        tm.put("China",50);
        tm.put("US",150);
        tm.put("Indonesia",80);


        System.out.println(tm);
        }
    }