public class quicksort {   
    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
    } 
    //pivot
    public static void quicksort(int arr[],int si, int ei){
        //base case
        if(si >= ei){
            return;
        }
        //last element
        int pindex = partition(arr, si, ei);
        quicksort(arr,si, pindex-1); //left
        quicksort(arr, pindex+1, ei); //right
    }

    public static int partition(int arr[],int si, int ei){
        int pivot= arr[ei];
        int i= si-1; //to make space for smaller elements

        for(int j=si; j< ei; j++){
            if(arr[j] <= pivot ){
                i++;
                //swap
                int temp= arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        //swap
        int temp= pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;

    }
    public static void main(String[] args) {
        int arr[]={6,9,3,4,8,10,12};
        quicksort(arr,0,arr.length-1);
        printarr(arr);
        
    }
}
