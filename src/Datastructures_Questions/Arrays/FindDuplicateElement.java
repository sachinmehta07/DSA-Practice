package Datastructures_Questions.Arrays;

public class FindDuplicateElement {
    static int DuplicateElement(int[] arr, int n){
        int ans = 0;
        for(int i=0;i<n;i++){
            ans = ans^arr[i];
        }
        for(int i=1;i<n;i++){
            ans = ans^i;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a = {2,5,3,4,1,1};
        System.out.println(DuplicateElement(a,a.length));
    }
}
