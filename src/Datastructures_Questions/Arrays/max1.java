package Datastructures_Questions.Arrays;
public class max1 {
    static void Max_Min(int[] a, int n){
        int max = a[0];
        int min = a[0];
        int index_max = 0;
        int index_min = 0;
        for(int i=1;i<n;i++){
            if(a[i]>max){
                max = a[i];
                index_max = i;
            }
            if(a[i]<min){
                min = a[i];
                index_min = i;
            }
        }
        System.out.println("max :"+max+ " At index : "+ index_max +"\n min :"+min+" At index : "+ index_min );
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,50};
        Max_Min(a,a.length);
    }
}
