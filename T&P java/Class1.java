import java.util.*;
class Class1{
    public static void main (String args[]){
        ArrayList<String>list = new ArrayList<String>();

        list.add("Ravi");
         list.add("Ankit");
          list.add("Akash");
           list.add("Aman");

           Iterator itr = list.iterator();
           while (itr.hasNext()){

            System.out.println(itr.next());
           }
    }
}