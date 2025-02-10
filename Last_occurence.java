public class Last_occurence {
    public static int checkk(int a[], int key,int i){
        if (i== -1)
        return -1;
        if(a[i]==key)
        return i;
        return checkk(a, key, i-1);
    }
    public static void main(String[] args) {
        int a[]={1,5,8,7,1,5};
        System.out.println(checkk(a,5,a.length-1));
    }
}
