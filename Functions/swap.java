package Functions;
//Q- Swap the values of 2 number.
public class swap {
    public static void swapping(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a+","+b);    
    }
    public static void main(String args[]){
        int a=2;
        int b=4;
        swapping(a,b);

    }   
}