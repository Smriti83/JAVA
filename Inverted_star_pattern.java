package Patterns_1;
/* Pattern-
 * * * *
 *  * *
 *  *
 * 
 */
import java.util.Scanner;
public class Inverted_star_pattern {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of lines");
        int a=sc.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=1;j<=a-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
