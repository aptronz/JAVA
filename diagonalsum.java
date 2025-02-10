import java.util.Scanner;

public class diagonalsum {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
   
        int A[][]= new int[3][3];
        
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                    A[i][j]=sc.nextInt();
            }
        }
        int n= A.length;
        // int psum=0; int j=0;
        // for(int i=0;i<n;i++){
        //     psum=psum+A[i][j];
        //     j++;
        // }
        // int ssum=0;j=n-1;
        // for(int i=0;i<n;i++){
        //     if(j!=i){
        //         ssum=ssum+A[i][j];
        //         j--;
        //     }
        // }
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+A[i][i];
                if(i!=A.length-1-i){
                    sum=sum+A[i][A.length-1-i];
                }
            }
        System.out.println("Diagonal sum is: "+sum);

    }
}

