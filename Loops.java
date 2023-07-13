import java.util.*;
public class Loops {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
//Q1- Print numbers from 1 to n. (Take n from user.)
         System.out.println("Enter the number");
         int a=sc.nextInt();
         for(int i=0;i<=a;i++){
            System.out.println(i);
        }
        
//Q2- Sum of n numbers. (Take n from user.)
        System.out.println("Enter the number");
         int b=sc.nextInt();
         int s=0;
         for(int j=0;j<=b;j++){
            s=s+j;
            System.out.println(s);
        }

//Q3- Reverse the number. (Take number from user.)
        System.out.println("Enter the number");
        int d=sc.nextInt();
        int rev=0;
        while (d>0){
            int ld=d%10;
            rev=(rev*10)+ld;
            d=d/10;
        }
        System.out.println("Rever of the given number is "+rev);


 //Q4- Write multiplication table of n. (Take n from user.)
        System.out.println("Enter the number");
         int c=sc.nextInt();    
         for(int k=0;k<=10;k++){
            int t=k*c;
            System.out.println(c+" X "+k+ " = "+t);
        }

//Q5- Find factorial of n. (Take n from user.)
        System.out.println("Enter the number");
         int e=sc.nextInt();
         int fact=1;    
         for(int m=1;m<=e;m++){
            fact=fact*m;
        }
            System.out.println("Factorial of " +e+ " is "+fact);
        
//Q6- Check whether a number is prime or not. (Take n from user.)
        System.out.println("Enter a number");
        int f=sc.nextInt();
        if (f==2){
           System.out.println(f+ " is a Prime number."); 
        }
        else{
            boolean isPrime=true;
            for(int z=2;z<=Math.sqrt(f);z++){
                if(f%z==0){
                    isPrime=false;
                }
            }
        if(isPrime==true){
            System.out.println(f+ " is a Prime Number.");
        }
        else{
            System.out.println(f+ " is not a Prime Number.");
        }
        }

    }
    
}
