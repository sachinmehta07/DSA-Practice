package Datastructures_Questions.AdvanceBinarySearch;

import java.util.Arrays;

public class AggressiveCow {

   static boolean isPossible(int[] Stalls,int k,int mid){
       int cowCount = 1;
       int lastpos = Stalls[0];
       for(int i=0;i<Stalls.length;i++){
           if(Stalls[i] - lastpos>= mid){
               cowCount++;
               if(cowCount == k){
                   return true;
               }
               lastpos = Stalls[i];
           }
       }
       return false;
   }
    static int aggressiveCows(int[] Stalls,int k){
        Arrays.sort(Stalls);
        int s = 0;
        int maxi = -1;
        int ans = -1;
        for (int i=0;i<Stalls.length;i++) {
            maxi = Math.max(maxi, Stalls[i]);
        }
        int e = maxi;
        int mid = s+(e-s)/2;
        while(s<=e){
            if(isPossible(Stalls,k,mid)){
                ans = mid;
                s = mid + 1;
            }else{
                e = mid-1;
            }
            mid = s+(e-s)/2;
        }
        return ans;
    }
    public static void main(String[] arg) {
        int[] cows = {4,2,1,3,6};
        System.out.println(aggressiveCows(cows,2));
    }
}
