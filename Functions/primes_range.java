package Functions;
//Q- Find out prime numbers in the given range.
public class primes_range {
        public static boolean isPrime(int n){
            if(n==2){
                return true;
            }
            for(int i=2;i<Math.sqrt(n);i++){
                if(n%i==0){
                    return false;
                }
    
            }
            return true;
        }
        public static void primes_range(int n){
            for(int i=2;i<n;i++){
                if(isPrime(i)){
                    System.out.print(i+" ");
                }
                System.out.println();
            }
        }
        public static void main(String args[]){
            primes_range(9);
        }
        
    }