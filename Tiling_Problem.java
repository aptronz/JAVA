public class Tiling_Problem {
    public static int tiling(int n) {
        //base case
        if(n==0||n==1)
        return 1;

        //vertical
        int fnm1= tiling(n-1);
        //horizontal
        int fnm2= tiling(n-2);
        int totalways= fnm1+fnm2;
        return totalways;
    }
    public static void main(String[] args) {
        System.out.println(tiling(4));
    }
    
}
