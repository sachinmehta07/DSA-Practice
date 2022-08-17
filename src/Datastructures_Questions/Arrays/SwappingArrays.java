package Datastructures_Questions.Arrays;

import java.util.Arrays;

public class SwappingArrays {
    static void Swap(int[] arr, int n){
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<n;i+=2){
            if(i+1<n){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] a = {10,20,30,40,50,60};
        Swap(a,a.length);
    }
}
