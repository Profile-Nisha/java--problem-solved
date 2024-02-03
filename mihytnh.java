public class mihytnh {
    public static void main(String args[]){
        int arr[] = {4,3,6,7,9,2};
        int min = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i] < min){
                min =arr[i];
            }
        }
        System.out.println("minimum number" + min);
    }
    
}
