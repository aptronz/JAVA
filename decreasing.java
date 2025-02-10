import java.util.*;
public class decreasing  {
    public static void decre(int n){
        System.out.println(n);
        if(n==1|| n==0){
            return ;
        }
        else
         decre(n-1);
    }
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        decre(n);
    }
}
