import java.util.*;
public class largest {
    public static int getlarger(int numbers[]){
        int larger=Integer.MIN_VALUE;
        for(int i =0;i<numbers.length;i++){
            if(larger<numbers[i]){
                larger=numbers[i];
            }
        }
        return larger;
    }
    public static void main(String args[]){
        int numbers[]={1,2,6,3,5};
        System.out.println("larger value:="+ getlarger(numbers));

    }
    
}
