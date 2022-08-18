package Datastructures_Questions.BinarySearch;

public class SearchElement {
    static int findKey(int[] arr,int n,int key){
        int start = 0;
        int end = n-1;
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
    public static void main(String[] args) {
        int[] a = {1,2,4,5,9,8,7};
        System.out.println(findKey(a,a.length,8));
    }
}

