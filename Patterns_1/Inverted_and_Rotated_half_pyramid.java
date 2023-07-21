package Patterns_1;
/*Q- Draw Inverted and Rotated half pyramid pattern which is as follows-
              *
            * *          
          * * * 
        * * * *
      * * * * *
    * * * * * *
  * * * * * * *
* * * * * * * *
*/
import java.util.*;
public class Inverted_and_Rotated_half_pyramid {
    public static void pyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows.");
        int n=sc.nextInt();
        pyramid(n);
    }
}