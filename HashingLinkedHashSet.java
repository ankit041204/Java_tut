import java.util.*;
public class HashingLinkedHashSet {

    public static void main (String args[]){
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Pune");
        cities.add("Solapur");
        cities.add("Patna");

        System.out.println(cities);

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Pune");
        lhs.add("Solapur");
        lhs.add("Patna");

        System.out.println(lhs);
    }
}