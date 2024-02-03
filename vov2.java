public class vov2 {
    public static void reverse(int numbers[]){
        int first = 0;
        int last = numbers.length-1;
        while(first < last){
            int temp = numbers[first];
            numbers[first] = numbers[last];
            numbers[last] = temp;

            first++;
            last--;
        }
    }
    public static void main(String args[]){
        int numbers[] = {2,3,5,7,8,9,4};
        reverse(numbers);
    }
    
}
