import java.util.*;
public class larg {
    public static int largernum(int numbers[]){
       int larger = Integer.MIN_VALUE;
       int smaller= Integer.MAX_VALUE;
       for(int i=0; i<numbers.length; i++){
        if(larger<numbers[i]){
           larger=numbers[i];
        }
        if(smaller>numbers[i]){
            smaller=numbers[i];
        }
       }
       System.out.println("smaller number: =" + smaller);
       return larger;
       

    }
    public static void main(String args[]){
        int numbers[] = {1,2,6,3,5};
        System.out.println("larger number: =" + largernum(numbers));
    }
    
}
