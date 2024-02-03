import java.util.*;
public class func2 {
    public static int sumofnumber(int a, int b){
        int sum = a+b;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
    
       int sum = sumofnumber(a, b);
       System.out.println(sum);
    }
    
}
