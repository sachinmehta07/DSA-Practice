package Datastructures_Questions.Arrays;

import java.util.Arrays;

public class ReturnEvenArrays {
    static void evenArrays(int[] arr){
        int[] b = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2 == 0){
                b[i] = arr[i] ;
            }
        }
        System.out.println(Arrays.toString(b));
    }


    public static void main(String[] args) {
        int[] a = {1,2,4,6,9,7,3};
        evenArrays(a);
    }
}
