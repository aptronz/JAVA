import java.util.*;
public class countsetbits {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter no.: ");
        int n= sc.nextInt();
        int count=0;
        while(n!=0){
            if((n&1)!=0)
            count++;
            n=(n>>1);
        }
        System.out.println("Set bits in the number is "+count);
    }
} // log n
