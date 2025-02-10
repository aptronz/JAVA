import java.util.*;

public class pow2 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no. : ");
        int n= sc.nextInt();
        if((n&n-1)==0){
            System.out.println("Power of 2");
        }
        else
        System.out.println("Not a power of 2");
    }
}
