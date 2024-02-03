public class mmma {
    public static int maxnum(int numbers[]){
     int max = numbers[0];
     for(int i = 0; i<numbers.length; i++){
        if(numbers[i] < max){
          max = numbers[i];
        }
     }
     return max;
    }
    public static void main(String args[]){
       int numbers[] = {4,2,67,45,32};
       System.out.println(maxnum(numbers));

    }
    
}
