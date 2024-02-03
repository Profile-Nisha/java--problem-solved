import java.util.*;
public class break2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int user = sc.nextInt();
        for(user = 1; user<=50;user++){
            if(user % 10==0){
                break;
            }
            System.out.println(user);
        }
        System.out.println("multiple of 10 then exit from the group");
    }
    
}
