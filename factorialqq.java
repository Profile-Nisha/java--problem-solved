public class factorialqq {
    public static int factorial(int n ){
        int f = 1;
        for(int i =  1; i<=n ; i++){
            f = f*i;
        }
        return f;
    }
    public static void main(String args[]){
        int f =  factorial(5);
        
        System.out.println(f);

    }
    
}