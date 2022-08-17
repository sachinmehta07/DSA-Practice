package Datastructures_Questions.Arrays;
import java.util.Arrays;

public class INtersectin {
    static void inters(int[] arr1, int[] arr2){
        int i = 0;
        int[] b = new int[5];
        int j = 0;
        while (i<arr1.length && j<arr2.length){
            if(arr1[i] == arr2[j]){
                b[i] = arr1[i];
                i++;
                j++;
            }else if(arr1[i] < arr2[j]){
                i++;
            }else {
                j++;
            }
        }
        for(int k=0;k<b.length;k++){
            if(b[k] == 0 ){
                System.out.println(Arrays.toString(b));
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {2,4,5};

        inters(a,b);

    }
}
