package Functions;
    //Q- Convert binary number to decimal number.
    public class dec_bin {
        public static void deci_bin(int a){
            int pow=0;
            int bin=0;
            while(a>0){
                int r=a%2;
                bin=bin+(r*(int)(Math.pow(10,pow)));
                pow++;
                a=a/2;
            }
            System.out.println(bin);   
        }
    public static void main(String args[]){
        deci_bin(10);
    }
    }
    
