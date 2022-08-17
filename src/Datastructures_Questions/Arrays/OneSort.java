package Datastructures_Questions.Arrays;

import java.util.Arrays;

public class OneSort {
    static void Onesort(int[] arr, int n) {
        int i = 0;
        int j = n-1;
        while (i < j) {
          while (arr[i] == 0) {
                i++;
            }
           while (arr[j] == 1) {
                j--;
            }
            if(i<j){
               int temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
               i++;
               j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] a = {0,1,0,0,1,1};
       Onesort(a,a.length);
    }
}
