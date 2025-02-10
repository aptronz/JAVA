import java.util.*;
public class Fibonacci {
    public static int fibo(int n){
        
        if(n==1||n==0){
            return 1;
        }
        int fnm1=fibo(n-1);
        int fnm2= fibo(n-2);
        int fnm= fnm1+fnm2;
        return fnm;
        
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(fibo(n));
    }
}
