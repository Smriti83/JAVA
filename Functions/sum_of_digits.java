package Functions;
//Q- Write a Java method to compute the sum of the digits in an integer.
import java.util.*;
public class sum_of_digits {
    public static int sum_digits(int n){
        int sum=0;
        int ld=0;
        while(n>0){
            ld=n%10;
            sum=sum+ld;
            n=n/10;
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        System.out.println(sum_digits(n));

    }
    
}
