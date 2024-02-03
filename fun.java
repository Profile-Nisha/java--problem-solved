import java.util.*;
    public class fun {
    public static void printhelloworld(){
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
        return; 
    }
    public static int calculatesum(int a,int b){//parmeter//
    
        int sum = a+b;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a =  sc.nextInt();
        int b = sc.nextInt();
        int sum=calculatesum(a,b);//arguments//
        System.out.println("sum is :" + sum);
    }
     
    
}
