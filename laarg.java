public class laarg {
    public static int largestnumber(int number[]){
        int largest = Integer.MIN_VALUE;
        for(int i =0; i<number.length;i++){
            if(number[i]>largest){
                largest = number[i];
            }
        }
        return largest;

        
    }
    public static void main(String args[]){
        int number[] = {1,2,6,3,5};
        System.out.println(largestnumber(number));
    }
    
}
