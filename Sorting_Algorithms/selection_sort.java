package Sorting_Algorithms;
//Selection sort
public class selection_sort {
    public static void selection_sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minPositive=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minPositive]>arr[j]){
                    minPositive=j;
                }
            }
            int temp=arr[minPositive];
            arr[minPositive]=arr[i];
            arr[i]=temp;
        }
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={3,5,8,9,0,7,1,6,2,4,10};
        selection_sort(arr);
        printArr(arr);
    } 
}
