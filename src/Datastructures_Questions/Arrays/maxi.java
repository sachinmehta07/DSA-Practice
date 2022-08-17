package Datastructures_Questions.Arrays;
public class maxi {
    static void getMax_Min(int[] arr, int n){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i=0;i<n;i++){
            max = Math.max(max,arr[i]);
            min = Math.min(min,arr[i]);
        }
        System.out.println("Maximum : " + max + "\nMinimum : "+min);
    }
    public static void main(String[] args) {
        int[] a = {1,2,90,45,87};
        getMax_Min(a,a.length);
    }
}
