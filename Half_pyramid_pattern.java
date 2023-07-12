package Patterns_1;
/* Pattern-
 1
 1 2
 1 2 3
 1 2 3 4 
 */
import java.util.Scanner;
public class Half_pyramid_pattern {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of lines");
        int a=sc.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
}
