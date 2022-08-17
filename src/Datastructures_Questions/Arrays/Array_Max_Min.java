package Datastructures_Questions.Arrays;

public class Array_Max_Min {
    static void Min_Max(int[] arr, int n) {
        int Max = arr[0];
        int Min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > Max) {
                Max = arr[i];
            }
            if (arr[i] < Min) {
                Min = arr[i];
            }
        }
        System.out.println("Maximum Value is : "+ Max +"\n Minimum Value is : "+ Min);
    }
    public static void main(String[] args) {
        int[] a = {1,48,500,89,0};
        Min_Max(a,a.length);
    }
}
