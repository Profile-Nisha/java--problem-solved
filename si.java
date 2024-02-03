import java.util.*;
public class si {
    public static void main(String args[]){
        System.out.println("enter a degree");
        Scanner sc = new Scanner(System.in);
        float degree = sc.nextFloat();
        if(degree >= 100){
            System.out.println("having fever :");
        }else{
            System.out.println("not fever");
        }
    }
    
}
