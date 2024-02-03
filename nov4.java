public class nov4 {
    
    public static void main(String args[]){
        int numbers[] = {2,4,6,3,7,8};
        for(int i = 0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                 if(numbers[i] < numbers[j]){
                 int temp = numbers[i];
                 numbers[i] = numbers[j];
                 numbers[j] = temp;
            }
        }
        System.out.println("second lrgest" + numbers[1]);
    }
    
}
