package Functions;
//Q- Convert binary number to decimal number.
public class bin_dec {
    public static void bin_deci(int a){
        int pow=0;
        int dec=0;
        while(a>0){
            int ld=a%10;
            dec=dec+ld*(int)(Math.pow(2,pow));
            pow++;
            a=a/10;
        }
        System.out.println(dec);   
    }
public static void main(String args[]){
    bin_deci(1001);
}
}