package Arrays;
//Q- Find largest number in the array.
import java.util.*;
public class largest_no {
    public static int largest(int num[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            if(num[i]>largest){
                largest=num[i];
            }
        }  
        return largest;      
    }
    public static void main(String args[]){
        int num[]={24,9,5,18,16,25,27,8,88};
        System.out.println("Largest number in the given array is "+largest(num));
    }  
}