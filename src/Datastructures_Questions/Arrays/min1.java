package Datastructures_Questions.Arrays;

public class min1 {
    static int getMin(int[] arr, int n){
        int min = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] arg) {
        int[] arr = {1,2,3,2,40};
        System.out.println(getMin(arr,arr.length));
    }
}