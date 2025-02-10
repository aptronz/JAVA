import java.util.*;

public class shortestpath {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter direction: ");
        String dir;
        dir= sc.next();
        int x=0,y=0,in_x,in_y;
        System.out.println("Enter intial points: ");
        in_x= sc.nextInt();
        in_y= sc.nextInt();
        for(int i=0;i<dir.length();i++){
            if(dir.charAt(i)=='n' || dir.charAt(i)== 'N')
                y=y+1;
            else if(dir.charAt(i)=='s' || dir.charAt(i)== 'S')
                y=y-1;
            else if(dir.charAt(i)=='E' || dir.charAt(i)== 'e')
                x=x+1;
            else if(dir.charAt(i)=='w' || dir.charAt(i)== 'W')
                x=x-1;
            else
                System.out.println("Invalid Direction");
            
            
        }
        float shortpath= (float)Math.sqrt(((x-in_x)*(x-in_x))+((y-in_y)*(y-in_y)));
        System.out.println("Shortest path is: "+ shortpath);
    }
}
