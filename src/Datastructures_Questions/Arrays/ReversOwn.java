package Datastructures_Questions.Arrays;

import java.util.Arrays;

public class ReversOwn {
    static void ReversArray(int[] arr, int n){
        int[] b = new int[n];
        int j = n;
        for (int i=0;i<n;i++){
            b[j-1] = arr[i];
            j = j-1;
        }
        System.out.println(Arrays.toString(b));
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        ReversArray(a,a.length);
    }
}
