package Datastructures_Questions.Arrays;

import java.util.Arrays;

public class UniqueNumberOfOccurunce {

    static void Duplicate(int[] arr, int n) {
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] a =  {1,2,3,3};
        Duplicate(a,a.length);
    }
}

