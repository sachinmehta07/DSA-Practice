package Datastructures_Questions.BinarySearch;

public class SearchRotedArray {
    static int getBinarySearch(int[] arr,int s,int e,int key){
        int start = s;
        int end = e;
        int mid = (start+end)/2;
       /* Using this we can prevent Int Overflow
         mid = start  + (end-start)/ 2*/
        while(start<=end){
            if(arr[mid] == key){
                return mid;
            }
            if(key > arr[mid]){
                start = mid  + 1;
            }else {
                end = mid - 1;
            }
            mid = (start+end)/2;
        }
        return -1;
    }
    static int getpivotElementArray(int[] arr){
        int s = 0;
        int e = arr.length - 1;
        int mid = s + (e-s)/2;
        while (s<e){
            if(arr[mid] >= arr[0]){
                s = mid +1;
            }else {
                e = mid;
            }
            mid = s + (e-s)/2;
        }
        return s;
    }
    static int sreachRotedSortedArray(int[] arr,int n,int key){
        int pivot = getpivotElementArray(arr);
        if(key >= arr[pivot] && key <= arr[n-1]){
            //BS ON SECOND LINE
            return getBinarySearch(arr,pivot,n-1,key);
        }else {
            //BS ON  FIRST LINE
            return getBinarySearch(arr,0,pivot-1,key);
        }
    }

    public static void main(String[] args) {
        int[] arr = {7,9,1,2,3};
        System.out.println(sreachRotedSortedArray(arr,arr.length,2));
    }
}
