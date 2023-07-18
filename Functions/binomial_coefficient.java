package Functions;
//Q- Find binomial Coefficient.
import java.util.*;
public class binomial_coefficient {
    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static int bin_coeff(int n, int r){
        int fact_n=factorial(n);
        int fact_r=factorial(r);
        int fact_nr=factorial(n-r);
        int binomial=fact_n/(fact_r*fact_nr);
        return binomial;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        System.out.println("Enter the value of r");
        int r=sc.nextInt();
        System.out.println(bin_coeff(n,r));
    }
    
}
