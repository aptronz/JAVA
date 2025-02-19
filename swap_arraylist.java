import java.util.*;
public class swap_arraylist {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList <> ();
        //Add elemnt
        list.add(1);
        list.add(2);
        list.add(10);
        list.add(12);
        list.add(112);
        int idx1=2;
        int idx2=4;
        System.out.println(list);
        //swap
        int temp= list.get(idx1);
        list.remove(idx1);
        list.add(idx1,(list.get(idx2-1)));
        list.remove(idx2);
        list.add(idx2,temp);
        System.out.println(list);
    }
}
