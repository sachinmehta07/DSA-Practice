package Datastructures_Questions.AdvanceBinarySearch;

public class BookAllocation {
    static boolean isPossible(int[] arr, int m, int n, int mid){
        int StudentCount = 1;
        int PageSum = 0;
        for(int i=0;i<n;i++){
            if(PageSum + arr[i] <= mid){
                PageSum = PageSum + arr[i];
            }else {
                StudentCount++;
                if(StudentCount > m || arr[i] > mid){
                    return false;
                }
                PageSum = arr[i];
            }
        }
        return true;
    }
    static int allocationBook(int[] arr,int m,int n){
        int s = 0;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum = sum + arr[i];
        }
        int e = sum;
        int mid = s+(e-s)/2;
        int ans = -1;
        while (s<=e){
            if(isPossible(arr,n,m,mid)){
                ans = mid;
                e = mid -1;
            }else {
                s = mid +1;
            }
            mid = s+(e-s)/2;
        }
        return ans;
    }
}
