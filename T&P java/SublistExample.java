import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SublistExample{
    public static void main (String args[]){

        ArrayList<String>names = new ArrayList<>(Arrays.asList("abs","gfh","hfgh","ygf","hfhfh"));

        System.out.println("Original list:"+names);

        List<String>sub = names.subList(1,4);

        System.out.println("Sub List:"+sub);
    }
}