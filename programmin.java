public class programmin {
    public static void main(String args[]){
        int arr[] = {2,1,4,6,5,9};
        int max = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("mximum number:" + max) ;
    }
    
}
