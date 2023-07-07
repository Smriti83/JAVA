import java.util.*;
public class conditional_statements {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
//Q1- Find largest among 2 numbers( Take values from user).
        System.out.println("Enter first number.");
        double a= sc.nextDouble();
        System.out.println("Enter first number.");
        double b= sc.nextDouble();
        if (a>b){
            System.out.println(a+"is the highest number.");
        }
        else{
            System.out.println(b+" is the highest number");
        }

 //Q2- Find odd numbers or even numbers( Take values from user).
        System.out.println("Enter first number.");
        int c= sc.nextInt();
        if (c%2==0){
            System.out.println(c+"is an even number.");
        }
        else{
            System.out.println(c+" is odd number.");
        }
//Q3- Calculate income tax ( Take values from user).
/* If your salary is between 0-5l, no tax is to be paid.
If your salary is between 5-10l, 20%  tax is to be paid.
If your salary is greater than 10l, 30% tax is to be paid. */
        System.out.println("Enter your salary.");
        double salary= sc.nextDouble();
        double total;
        if (salary<= 500000){
            System.out.println("Hurray! You don't have to pay tax.");
            System.out.println("Total amount= "+salary);
        }
       else if(salary>500000 & salary<=1000000) {
            System.out.println("You have to pay 20% tax.");
            total=salary+0.20*salary;
            System.out.println("Total amount= "+total);
        }    
        else{
            System.out.println("You have to pay 30% tax.");
            total=salary+0.30*salary;
            System.out.println("Total amount= "+total);
        }    

 //Q4- Find largest among 3 numbers( Take values from user).
        System.out.println("Enter first number.");
        double i= sc.nextDouble();
        System.out.println("Enter second number.");
        double j= sc.nextDouble();
        System.out.println("Enter third number.");
        double k= sc.nextDouble();
        if (i>j & i>k){
            System.out.println(i+"is the highest number.");
        }
        else if (i>j & j>k){
            System.out.println(j+" is the highest number");
        }
        else{
            System.out.println(k+" is the highest number.");
        }

//Q5- A simple Mathematical calculator ( Take values from user).
        System.out.println("Enter first number.");
        double s= sc.nextDouble();
        System.out.println("Enter first number.");
        double t= sc.nextDouble();
        System.out.println("Enter operator (+,-,*,/,%)");
        char operator=sc.next().charAt(0);
        switch(operator){
            case '+':System.out.println(s+t);
            break;
            case '-':System.out.println(s-t);
            break;
            case '*':System.out.println(s*t);
            break;
            case '/':System.out.println(s/t);
            break;
            case '%':System.out.println(s%t);
            break;
            default: System.out.println("Wrong inputs");
        }

//Q6- Find which year is a leap year( Take values from user).
        System.out.println("Enter year.");
        int year= sc.nextInt();
        boolean x=(year%4)==0;
        boolean y=(year%100)!=0;
        boolean z=(year%400==0) && (year%100==0);
        if (x&&(y||z)){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not a Leap year");
        }


    }
    
}
