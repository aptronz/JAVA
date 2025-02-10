
public class First_occurence {
    public static int checkk(int a[], int key,int i){
        if (i== a.length)
        return -1;
        if(a[i]==key)
        return i;
        return checkk(a, key, i+1);
    }
    public static void main(String[] args) {
        int a[]={1,5,8,7,5};
        System.out.println(checkk(a,5,0));
    }
    

    
}
