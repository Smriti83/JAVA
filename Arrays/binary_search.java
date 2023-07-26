package Arrays;
// Q- Binary Search
public class binary_search {
    public static int binary_search(int n[], int key){
        int start=0;
        int last=n.length-1;
        while(start<=last){
            int mid=(start+last)/2;
            if(n[mid]== key){
                return  mid;
            }
            else if (n[mid]<key){
                start= mid+1;
            }
            else{
                last= mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int n[]={2,4,6,8,10,12,14};
        int key=14;
        System.out.println("Index for the key is "+binary_search(n, key));
    }
}