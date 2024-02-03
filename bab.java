import java.util.*;
public class bab {
    public static void main(String args[]){
        System.out.println("entaer a number :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if( a >= b && a < c){
            System.out.println("a is greater : " + a);
        }
        else if(b >= c){
            System.out.println("b is greater : " + b);
        }
        else{
            System.out.println("c is greater : " + c);

        }
        System.out.println("this is the comparison of three number which is greater:");


    }
    
}
