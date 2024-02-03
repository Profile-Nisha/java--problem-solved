import java.util.*;
public class vi {
    public static void main(String args[]){
        System.out.println("enter aa year");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year%4 == 0){
            System.out.println("this is leap year:" + year);

        }else{
            System.out.println("not a leap year" + year);
        }
    }
    
}
