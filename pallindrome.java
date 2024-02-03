import java.util.*;
public class pallindrome {
    public static boolean isPalindrome(int number){
        int palindrome = number;
        int reverse = 0;
        while(palindrome != 0){
            int remainder = palindrome % 10;
            reverse = reverse *10 +remainder;
            palindrome = palindrome / 10;

        }
        if (number == reverse){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String args[]){
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int palindrome = sc.nextInt();
       if( isPalindrome(palindrome)){
        System.out.println("number "  +  palindrome + " is a pallindrome");
       }else{
        System.out.println("number "  +  palindrome + " is not a pallindrome");
       }

        }

    }
    

