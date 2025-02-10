import java.util.*;
public class trappingrainwater {
    public static int trappedwater(int height[]){
        int n=height.length;
        int leftmax[]= new int [n];
        int rightmax[]= new int[n];
        leftmax[0]=height[0];
        for(int i=1;i<n;i++){
            leftmax[i]= Math.max(leftmax[i-1],height[i]);
        }
        rightmax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(rightmax[i+1],height[i]);
        }
        int trappedwater=0;
        for(int i=0;i<n;i++){
            int waterlevel=Math.min(leftmax[i],rightmax[i]);
            trappedwater += waterlevel-height[i];
        }
        return trappedwater;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a[]={4,2,0,6,3,2,5};
        int x=trappedwater(a);
        System.out.println(x);
    }    
}
