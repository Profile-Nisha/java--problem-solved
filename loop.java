import java.util.*;
public class loop {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number :");
    int n = sc.nextInt();
     int counter = 0;
     int sum = 0;
     while(counter<=n) {
        sum = sum + counter;
        System.out.println(sum);
        counter++;
     }
    }
    
}
