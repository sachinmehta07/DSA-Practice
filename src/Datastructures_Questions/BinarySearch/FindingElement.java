package Datastructures_Questions.BinarySearch;

public class FindingElement {
    static int findelement(int[] arr,int n,int key){
        int Start = 0;
        int End = n-1;
        int mid = Start +(End-Start)/2;
        while (Start<=End){
            if(arr[mid] == key){
                return mid;
            }
            else if(key > arr[mid]){
                Start = mid + 1;
            }else {
                End = mid -1;
            }
            mid = Start +(End-Start)/2;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {1,6,9,10,11,12,15};
        System.out.println(findelement(a,a.length,6));
    }
}
