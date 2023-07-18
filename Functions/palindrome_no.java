package Functions;
import java.util.*;
//Q- Write a Java program to check if a number is a palindrome in Java?
public class palindrome_no {
    public static boolean ispalindrome(int number){
        int palin=number;
        int rev=0;
        int rem;
        while(palin!=0){
            rem=palin%10;
            rev=(rev*10)+rem;
            palin=palin/10;
        }
       if(number==rev){
        return true;
       }       
        return false;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int number=sc.nextInt();
        if(ispalindrome(number)){
            System.out.println("Given number "+number+ " is a palindrome no.");
        }
        else{
            System.out.println("Given number "+number+ " is not a palindrome no.");

        }
    }
}
