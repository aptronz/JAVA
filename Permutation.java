import java.util.*;
public class Permutation {
    public static void find(String str, String ans) {
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            char current= str.charAt(i);
            String newstr= str.substring(0,i)+ str.substring(i+1); //by default destination is n-1
            find(newstr, ans+current); 
        }
       
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= "abc";
        find(str,  "");
    }
}
