
import java.util.*;
public class Reverse_arraylist {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList <> ();
        //Add elemnt
        list.add(1);
        list.add(2);
        list.add(10);
        list.add(12);
        for(int i= ((list.size())-1); i>=0;i--){
            System.out.println(list.get(i)+" ");
        }
    }
}
