import java.util.Scanner;
public class Variables_and_datatypes{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
//Q1- Find area of the circle. (Take values from user)
        System.out.println("Enter radius of the circle");
        double r=sc.nextDouble();
        double area_circle=3.14*r*r;
        System.out.println("Area of the circle is = "+area_circle);
//Q2- Find area of the square. (Take values from user)
        System.out.println("Enter length of the side of square");
        double s=sc.nextDouble();
        double area_square=s*s;
        System.out.println("Area of the circle is = "+area_square);
//Q3- Find average of three numbers. (Take values from user)
        System.out.println("Enter first number");
        double a=sc.nextDouble();
        System.out.println("Enter second number");
        double b=sc.nextDouble();
        System.out.println("Enter third number");
        double c=sc.nextDouble();
        double average=(a+b+c)/3;
        System.out.println("Area of the circle is = "+average);
        //Q4- Entrt cost of 3 items. Output the total cost of the items back to user to bill by adding 18% GST Tax.
        System.out.println("Enter the cost of pencil");
        double pencil=sc.nextDouble();
        System.out.println("Enter the cost of pen");
        double pen=sc.nextDouble();
        System.out.println("Enter the cost of eraser");
        double eraser=sc.nextDouble();
        double cost=pencil+pen+eraser;
        System.out.println("Cost =" +cost);
        double total_cost=cost+0.18*cost;
        System.out.println("Total cost ="+total_cost);

    }
}

