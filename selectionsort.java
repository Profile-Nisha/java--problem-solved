public class selectionsort {
    public static void selectionsort(int arr[]){
        for(int i = 0; i<arr.length-1; i++){
            int minpos = i;
            for(int j = i + 1; j<=arr.length-1; j++){
                if(arr[minpos] < arr[j]){
                    minpos = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minpos];
            arr[minpos] = temp;
        }
    }
    public static void printarr(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        selectionsort(arr);
        printarr(arr);
    }
    
}
