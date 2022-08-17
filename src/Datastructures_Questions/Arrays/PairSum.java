package Datastructures_Questions.Arrays;

public class PairSum {
    static void Pair(int[] arr,int s) {
        int sum;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    sum = arr[i] + arr[j] + arr[k];
                    if (sum == s) {
                        System.out.println(arr[i] + " " + arr[j]+" "+arr[k]);
                        break;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        Pair(a,12);
    }
}
