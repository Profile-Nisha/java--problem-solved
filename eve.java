public class eve {
    public static boolean isEven(int n){
        boolean isEven = true;
        if(n%2!=0){
            isEven = false;
        }
        return isEven;
    }
    public static void main(String args[]){
        System.out.println(isEven(5));

    }
    
}
