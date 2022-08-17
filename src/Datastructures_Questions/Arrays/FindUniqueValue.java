package Datastructures_Questions.Arrays;
public class FindUniqueValue {
    static void unique(int[] arr, int n){
            int uniques = 0;
            for (int i=0;i<n;i++){
               uniques = uniques ^ arr[i];
            }
        System.out.println(uniques);
    }

    public static void main(String[] args) {
        int[] a = {1,2,1,2,5,4,5,4,6,8,6};
        unique(a,a.length);
    }
}
