import java.util.*;
public class bitoperation {
    // GET 'i'th bit

    public static int getIth(int n,int i){
        if((n &(1<<i)) == 0){
            System.out.println("ith bit is 0");
            return 0;
        }
        else {
            System.out.println("ith bit is 1");
            return 1;
        }
    }
    
    //set ith bit

    public static int setIth(int n,int i){
        int bitmask= 1<<i;
        return n|bitmask;
    }

    //clear Ith position

    public static int clearIth(int n,int i){
        int bitmask= ~(i<<1);
        return n&bitmask;
    }

    //update ith bit
    public static int updateIth(int n, int i,int newbit){
        if(newbit == 0)
        return clearIth(n,i);
        else 
        return setIth(n,i);
    }

    // clear last i bits
    public static int clearIbits(int n, int i){
        int bitmask=(~0)<<i;
        return n&bitmask;
    }


    //clear range of bits
    public static int clearrange(int n,int i,int j){
        int a= ((~0)<<(j+1));
        int b=(1<<i)-1;
        int bitmask= a|b;
        return(n & bitmask);
    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter i:");
        int i= sc.nextInt();
        System.out.print("\nEnter n:");
        int n=sc.nextInt();
        int x= getIth(n,i);
        x=setIth(n,i);
        System.out.println(x);
        x=clearIth(n,i);
        System.out.println(x);
        System.out.println("Enter new bit only 0 or 1 : ");
        int newvalue=sc.nextInt();
        x=updateIth(n,i,newvalue);
        System.out.println(x);
        System.out.println(clearrange(n,i,4));

    }
}
