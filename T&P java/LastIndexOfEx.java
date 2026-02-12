import java.util.ArrayList;
public class LastIndexOfEx{
    public static void main (String args[]){
        ArrayList<String> list = new ArrayList<>(Arrays.asList("a","b","c","b","d"));

        System.out.println(list.lastIndexOf("b"));
    }
}