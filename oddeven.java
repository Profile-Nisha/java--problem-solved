import java.util.*;
public class oddeven {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        if(input % 2 == 0){
            System.out.println("number is even");
        }
        else{
            System.out.println("number is odd");
        }
    }
    
}
