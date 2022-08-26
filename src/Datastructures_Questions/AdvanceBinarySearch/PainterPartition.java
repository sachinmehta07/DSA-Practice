package Datastructures_Questions.AdvanceBinarySearch;

public class PainterPartition {
    static	boolean isPossible(int[] arr,int n,int k,int mid) {
        int PainterCount = 1;
        int WallSum = 0;
        for(int i=0;i<n;i++) {
            if(WallSum + arr[i]<= mid) {
                WallSum = WallSum+arr[i];
            }else {
                PainterCount++;
                if(PainterCount > k || arr[i] > mid ) {
                    return false;
                }
                WallSum = arr[i];
            }
        }
        return true;
    }

    static int PainterPartitions(int[] arr,int n,int k) {
        int s = 0;
        int sum = 0;
        for(int i=0;i<n;i++) {
            sum = sum +  arr[i];
        }
        int e = sum;
        int mid = s+(e-s)/2;
        int ans = -1;
        while(s<=e) {
            if(isPossible(arr,n,k,mid)) {
                ans = mid;
                e = mid - 1;
            }else {
                s = mid+1;
            }
            mid = s+(e-s)/2;
        }
        return ans;
    }

    public static void main(String[] arg) {
        int[] Walls = {5,5,5,5};
        System.out.println(PainterPartitions(Walls,Walls.length,2));
    }
}
