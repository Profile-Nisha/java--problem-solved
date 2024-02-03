public class sun {
    public static void subarray(int numbers[]){
        //int start = 0;
        //int last = numbers.length;
        int ts = 0;
        for(int i = 0;i< numbers.length;i++ ){
            int start = i;
            for(int j = i+1; j<numbers.length; j++){
                int last = j;
                for(int k = start; k<=last; k++){
                    System.out.print(numbers[k] + " ");
                    
                }
                ts++;
                System.out.println();
            }
            System.out.println();
            
        }
        System.out.print("total number of pair : " + ts);
    }
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10};
        subarray(numbers);
    }
    
}
