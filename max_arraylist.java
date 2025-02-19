
import java.util.*;

public class max_arraylist {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList <> ();
        //Add elemnt
        list.add(1);
        list.add(2);
        list.add(10);
        list.add(12);
        int max= list.get(0);
        for(int i=0; i< list.size();i++){
            if(max<list.get(i)){
                max=list.get(i);
            }
            // max= Math.max(max,list.get(i));
            
        }
        System.out.println("Max is: "+max);
    }
}
