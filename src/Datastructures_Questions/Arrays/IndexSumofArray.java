package Datastructures_Questions.Arrays;
public class IndexSumofArray {
    static void SumOfPair(int[] arr, int n, int Target) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == Target) {
                    System.out.println("[" + i + "," + j + "]");
                    break;

                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {10,20,30,40,50};
        int target = 70;
        SumOfPair(a,a.length,target);
    }
}
