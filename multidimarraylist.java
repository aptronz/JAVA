import java.util.*;
public class multidimarraylist {
    public static void main(String args[]){
        ArrayList <ArrayList> mainlist = new ArrayList<> ();
        ArrayList<Integer> list1=new ArrayList <>();
        list1.add(1);
        list1.add(2);
        list1.add(10);
        list1.add(12);
        mainlist.add(list1);
        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(4);
        list2.add(24);
        list2.add(11);
        list2.add(14);
        mainlist.add(list2);
        for(int i= 0;i< mainlist.size();i++){
            ArrayList<Integer> curr =mainlist.get(i);
            for(int j= 0;j<curr.size();j++){
                System.out.print(curr.get(j)+" ");
            }
            System.out.println();
        }
        System.out.println(mainlist);
    }
}
