package Patterns_1;
/* Draw 0-1 triangle pattern as follows-
Enter number of rows
8

1   
01  
101 
0101
10101
010101
1010101
01010101
 */
import java.util.*;
public class triangle_0_1 {
    public static void triangle_0_1_pattern(int n){
        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of rows");
        int n=sc.nextInt();
        triangle_0_1_pattern(n);
    }
    
}
