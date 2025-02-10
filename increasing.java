import java.util.*;
public class increasing  {
    public static void incre(int n){
        
        if(n==1|| n==0){
            System.out.println(n);
            return ;
        }
        else
        incre(n-1);
        System.out.println(n);
        
    }
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        incre(n);
    }
}
