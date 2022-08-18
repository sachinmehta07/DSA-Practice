package Datastructures_Questions.BinarySearch;

public class PeakIndexArrays {
   static int PeakMountainArrays(int[] arr){
       int s = 0;
       int e = arr.length - 1;
       int  mid = s + (e-s)/2;
       while (s<e){
           if(arr[mid] < arr[mid + 1]){
               s = mid + 1;
           }else {
               e = mid;
           }
           mid = s + (e-s)/2;
       }
       return s;
   }

    public static void main(String[] args) {
        int[] a = {0,0,1,0,0,0};
        System.out.println(PeakMountainArrays(a));
    }
}
