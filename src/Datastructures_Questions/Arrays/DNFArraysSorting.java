package Datastructures_Questions.Arrays;

import java.util.Arrays;

public class DNFArraysSorting {
    static void zeroOneTwoSort(int[] arr, int n){
        int mid = 0;
        int low = 0;
        int high = n-1;
        while (mid<=high){
            if(arr[mid] ==  1){
                mid++;
            }
           else if(arr[mid] == 2){
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
            if(arr[mid] == 0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] a = {0,2,2,1,1,0,0,2,1};
        zeroOneTwoSort(a,a.length);
    }
}
