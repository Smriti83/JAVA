package Patterns_1;
/* Q- Draw floyd triangle pattern as-
 Enter number of rows.
8

1 
2 3
4 5 6
7 8 9 10
11 12 13 14 15
16 17 18 19 20 21
22 23 24 25 26 27 28 
29 30 31 32 33 34 35 36
 */

import java.util.*;
public class floyd {
    public static void floyd_triangle(int n){
        int c=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows.");
        int n=sc.nextInt();
        floyd_triangle(n);

    }
    
}
