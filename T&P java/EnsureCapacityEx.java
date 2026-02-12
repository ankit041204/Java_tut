import java.util.ArrayList;
public class EnsureCapacityEx{
    public static void main (String args[]){

        ArrayList<Integer>list = new ArrayList<>();
        list.ensureCapacity(5);

        list.add(1);
         list.add(2);
          list.add(3);
           list.add(6);
            list.add(2);
             list.add(3);

             System.out.println(list);
    }
}