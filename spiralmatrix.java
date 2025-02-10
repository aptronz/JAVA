//spiral matrix
import java.util.*;
public class twodim {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
   
        int A[][]= new int[3][3];
        
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                    A[i][j]=sc.nextInt();
            }
        }
        int startrow=0;
        int startcol=0;
        int endrow=A.length-1;
        int endcol= A[0].length-1;

        while(startrow<=endrow && startcol<= endcol){
            //top
            for(int j=startcol;j<=endcol;j++){
                System.out.print(A[startrow][j]+" ");
            }

            //right
            for(int i= startrow+1;i<=endrow;i++){
                System.out.print(A[i][endcol]+" ");
            }

            //bottom
            for(int j=endcol-1 ;j>=startcol;j--){
                if(startrow==endrow){
                    break;
                }
                System.out.print(A[endrow][j]+" ");
            }
            

            //left
            for (int i=endrow-1; i>startrow; i--){
                if(startcol==endcol){
                    break;
                }
                System.out.print(A[i][startcol]+" ");
            }

            startcol++;
            startrow++;
            endcol--;
            endrow--;
        }
        System.out.println();

       
    }
}
