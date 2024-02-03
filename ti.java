import java.util.*;
public class ti {
    public static void main(String args[]){
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(number > 0){
            System.out.println("positive number");
        }else{
            System.out.println("negative number");
        }
    }
    
}
