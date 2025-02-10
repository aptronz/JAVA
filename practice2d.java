import java.util.*;
public class practice2d {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
   
        int A[][]= new int[3][2];
        int n=A.length;
        int m=A[0].length;
        for (int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                    A[i][j]=sc.nextInt();
            }
        }
        // //1. count occurance of key in matrix


        // int key,count=0;
        // System.out.print("Enter key: ");
        // key= sc.nextInt();
        // for(int i=0;i<A.length;i++){
        //     for(int j=0;j<A[0].length;j++){
        //         if(key== A[i][j])
        //             count=count+1;
        //     }
        // }
        // System.out.println("key "+key + " appeared "+count+" times");



        //transpose of matrix

        int transpose[][]= new int[m][n];
        for(int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                transpose[i][j]=A[j][i];
            }
        }
        for(int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }

    }
}
