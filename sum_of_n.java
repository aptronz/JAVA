import java.util.*;
public class sum_of_n {
    public static void summ(int n,int sum){
        if(n==1){
            sum=sum+1;
            System.out.println(sum);
            return;
        }
        else{
            sum=sum+n;
            summ(n-1,sum);
        }
       
        
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        summ(n,0);
    }
}
