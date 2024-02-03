import java.util.*;
public class inputn {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int counter = 1;
        while(counter<=input){
            System.out.print(counter + " ");
            counter++;
        }
    }
    
}
