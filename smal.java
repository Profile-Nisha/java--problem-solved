public class smal {
    public static int getsmallestnumber(int numbers[]){
        int smallest = Integer.MAX_VALUE;
        for(int i =0; i<numbers.length;i++){
            if(numbers[i] < smallest){
                smallest = numbers[i];

            }
        }
        return smallest;
    }
    public static void main(String args[]){
        int numbers[] = {1,2,6,3,5};
        System.out.println(getsmallestnumber(numbers));
    }
    
}
