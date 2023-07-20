package Patterns_1;
/*  Draw Hollow Rectangle pattern which is as follows
* * * * * * * *
*             *
*             *
*             *
* * * * * * * *
*/
import java.util.*;
public class Hollow_Rectangle {
    public static void hollow_rect(int r, int c){
        for(int i=1;i<=r;i++){
            for (int j=1;j<=c;j++){
                if( i==1 || i==r || j==1 || j==c){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        }

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int r=sc.nextInt();
        System.out.println("Enter number of rows");
        int c=sc.nextInt();
        hollow_rect(r,c);

    }
    
}
