package Datastructures_Questions.Arrays;

public class SumOfArrays {
    static void SumOfArray(int[] arr,int n) {
        int sum = 0;
        for(int i=0;i<n;i++){
        sum = sum + arr[i];
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int[] arr = {2,7,1,-4,11};
        SumOfArray(arr,arr.length);
    }
}

