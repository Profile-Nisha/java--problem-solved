import java.util.*;
public class continue2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(n = 1; n <=100; n++){
            if(n%10==0){
                continue;
            }
            System.out.println(n);
        }
    }

}
