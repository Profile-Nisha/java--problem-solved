import java.util.*;
public class ln {
    public static int linearsearch(int numbers[],int key){
        for(int i =0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
            
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[]={2,4,6,8,10,12,14,16,18,20};
        int key=20;
         int value =linearsearch(numbers, key);
         System.out.println("the index is : = " + value);
         System.out.println("size of array:="+ numbers.length);

    }
    
}
