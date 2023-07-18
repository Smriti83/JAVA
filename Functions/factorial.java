package Functions;
//Q- Find factorial of a number.
public class factorial {
    public static int fact(int a){
        int f=1;
        for(int i=1;i<=a;i++){
            f=f*i;
        }
        System.out.println(f);
        return f;
    }
    public static void main(String args[]){
        int f=fact(5);
    }
    
}
