import java.util.Arrays;
import java.util.Collections;
public class inbuilt {
    public static void printarr(Integer arr[]){
        for(int i = 0; i<=arr.length-1;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        Integer arr[] = {5,4,1,3,2};
        Arrays.sort(arr,0,5,Collections.reverseOrder());
        printarr(arr);
    }
    
}
