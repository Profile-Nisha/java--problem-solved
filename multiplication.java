import java.util.*;
public class multiplication {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the table :");
        int n = sc.nextInt();
        
        for(int i = 1 ;i <= 10; i++){
        System.out.println(n + "*" + i + "=" + n*i);
    }
    System.out.println("multiplication of 5");
}
}
