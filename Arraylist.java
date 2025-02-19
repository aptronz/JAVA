import java.util.*;
public class Arraylist{
    public static void main(String[] args) {
        //Syntax
        ArrayList <Integer> list = new ArrayList <> ();
        //Add elemnt
        list.add(1);
        list.add(2);
        list.add(10);
        list.add(12);
        //print list
        System.out.println(list);
        //remove
        list.remove(3);
        System.out.println(list);
        list.add(2,155);
        System.out.println(list);
        //check contains
        System.out.println(list.contains(2));
        System.out.println(list.contains(111));
        //get value at index
        System.out.println(list.get(2));
        //Size of arraylist
        System.out.println( list.size());
        //sort in ascending order
        Collections.sort(list);
        System.out.println(list);
        //sort in descending order
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}