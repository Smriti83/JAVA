package Functions;

import java.util.*;
//Q- Write a method named isEven that accepts an inta rgument. The method should return true if th eargument is even, or false otherwise. Also write a program to test your method
public class even_no {
    public static boolean isEven(int n){
        if(n%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        if(isEven(n)){
            System.out.println(n +" is an even number.");
        }
        else{
            System.out.println(n +" is not an even number.");
        }


    }
    
}
