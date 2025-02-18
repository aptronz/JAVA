import java.util.*;
public class odd_even_sum {
    public static int printt(int n,int sum) {
        if(n==0)
        return sum;
        int x= printt(n-1,sum);
        
        if(n%2==0){
            sum=sum-n+x;
        }
        else
        sum=sum+n+x;
        
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        
        System.out.println(printt(n,0));
        
    }
}
