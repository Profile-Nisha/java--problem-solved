public class li {
    public static void linearsearch(int numbers[], int key){
        for(int i = 0; i<numbers.length; i++){
            if(numbers[i] ==key ){
                System.out.println(key);
            }
        }
    }
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10,12};
        int key = 12;
        linearsearch(numbers, key);
    }
    
}
