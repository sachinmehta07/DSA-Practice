package Datastructures_Questions.BinarySearch;

public class SearchElement {
    static int findKey(int[] a,int key,int n){
       int s = 0;
       int e = n-1;
       int mid = (s+e)/2;

       while(s<=e){

           if(a[mid] == key){
               return 1   ;
           }
           else if (key > a[mid] ){
               s = mid  + 1;
           }else {
               e = mid -  1;
           }
           mid = (s+e)/2;
       }
       return -1;

    }
    public static void main(String[] args) {
        int[] a = {1,2,4,5,9,8,7};
        System.out.println(findKey(a,8,a.length));
    }
}

