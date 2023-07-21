package Patterns_1;
/* Draw diamond pattern as follows-
Enter number of lines
8

       *     
      ***    
     *****   
    *******  
   ********* 
  ***********
 *************
***************
***************
 *************
  ***********
   *********
    *******
     *****
      ***
       *
 
 */
import java.util.*;
public class diamond {
        public static void main(String args[]) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter number of lines");
            int n=sc.nextInt();
            diamond(n);
        }
       
        public static void diamond(int n){
             for(int i=1;i<=n;i++){
                for(int j=1;j<=(n-i);j++){
                   System.out.print(" ");
                }
                for(int j=1;j<=(2*i-1);j++){
                   System.out.print("*");
                }
                System.out.println();
             }
    
             for(int i=n;i>=1;i--){
                for(int j=1;j<=(n-i);j++){
                   System.out.print(" ");
                }
                for(int j=1;j<=(2*i-1);j++){
                   System.out.print("*");
                }
                System.out.println();
             }
          }           
        }