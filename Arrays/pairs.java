package Arrays;
// Q- Find all possible pairs that can be made using the array.
public class pairs {
    public static void pairsArray(int n[]){
        int t=0;
        for(int i=0;i<n.length;i++){
            for(int j=i+1;j<n.length;j++){
                System.out.print("("+n[i]+","+n[j]+")");
                t++;
            }
            System.out.println();
        }
        System.out.println("total pairs= "+t);
    }
    public static void main(String args[]){
        int n[]={2,4,6,8,10};
        pairsArray(n);
    }
}