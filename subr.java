public class subr {
    public static void subarr(int numbers[]){
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0 ; i<numbers.length; i++){
            int start = i;
            for(int j = i+1; j<numbers.length; j++){
                int end = j;
                int currSum = 0;
                for(int k = start ; k<=end; k++){
                    currSum += numbers[k];
                    
                }
                if(currSum < maxSum){
                    maxSum= currSum;
                }
                System.out.println(currSum);
                
            }
        }
        System.out.println (maxSum);
    }
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10};
        subarr(numbers);

    }
    
}
