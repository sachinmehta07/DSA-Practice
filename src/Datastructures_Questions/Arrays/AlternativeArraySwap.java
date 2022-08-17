
package Datastructures_Questions.Arrays;
import java.util.Arrays;

public class AlternativeArraySwap {
    static void swapAlternate(int[] arr, int size){
        System.out.println(Arrays.toString(arr));
        for(int i=0; i<size-1; i+=2)
        {
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] a = {10,20,30,40,50,60};
        swapAlternate(a,a.length);
    }
}
