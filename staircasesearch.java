import java.util.Scanner;

public class staircasesearch {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
   
        int A[][]= new int[3][3];
        
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                    A[i][j]=sc.nextInt();
            }
        }
        int flag=0;
        System.out.println("Enter key: ");
        int key=sc.nextInt();
        int row=0,col=A.length-1;
        while( row < A.length && col >= 0 ){
            if(A[row][col]==key){
                System.out.println("Key found");
                flag=1;
                return ;
            }
            else if(key< A[row][col] ) {
                col--;
            }
            else {
                row++;
            }
        }
      
        System.out.println("key not found");

        
    }
}
