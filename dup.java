public class dup {
    public static int duplicatevalue(int numbers[]) {
        for(int i =0;i < numbers.length-1;i++){
            for(int j = i +1; j < numbers.length; j++){
                if(numbers[i] == numbers[j]){
                    return numbers[j];
                }
                }
            }
            return -1;
        }
    
    public static void main(String args[]){
        int numbers[] = {2,4,5,2,5};
        
        System.out.println(duplicatevalue(numbers));

    }
    
}
