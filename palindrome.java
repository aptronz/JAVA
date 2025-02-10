public class palindrome {
    public static void main(String args[]){
        String str= "racecar";
        int flag=0, n= str.length(),j=str.length()-1;
        for(int i=0;i<=n/2;i++){
            if(str.charAt(i)==str.charAt(j))    
                j--;
            else{
                flag=1;
                break;
            }
        }
        if(flag==0)
            System.out.println("Palindrome");
        else
            System.out.println("Non-Palindrome");
    }
}
