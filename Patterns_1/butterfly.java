package Patterns_1;
/* Q- Draw butterfly pattern as follows-
Enter n
5

*        *
**      **
***    ***
****  ****
**********
**********
****  ****
***    ***
**      **
*        *
 
 */
import java.util.*;
public class butterfly {
        public static void butterfly_pattern(int n){
            //1st half
            for (int i=1;i<=n;i++){
                //stars
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                 //space
                for(int j=1;j<=2*(n-i);j++){
                    System.out.print(" ");
                }
                 //stars
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
               //2nd half
            for (int i=n;i>=1;i--){
                //stars
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                 //space
                for(int j=1;j<=2*(n-i);j++){
                    System.out.print(" ");
                }
                 //stars
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        public static void main(String args[]){
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter n");
            int n=sc.nextInt();
            butterfly_pattern(n);
        }
    }
