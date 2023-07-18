package Functions;

import java.util.*;
//Q-Find average of 3 user-entered numbers.
public class average {
    public static double average(double a,double b,double c){
        double d=(a+b+c)/3;
        return d;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number");
        double a=sc.nextDouble();
        System.out.println("Enter second number");
        double b=sc.nextDouble();
        System.out.println("Enter third number");
        double c=sc.nextDouble();
        System.out.println("Average of given three numbers are "+average(a,b,c));
        }
    
}
