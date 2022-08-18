package Datastructures_Questions.BinarySearch;

public class First_Last_Occurnce {

    static int left_occ(int[] arr, int n, int key) {

        int Strat = 0;
        int End = n - 1;
        int ans = -1;
        int mid = Strat + (End - Strat) / 2;
        while (Strat <= End) {
            if (arr[mid] == key) {
                ans = mid;
                End = mid - 1;
            } else if (key > arr[mid]) {
                Strat = mid + 1;
            } else {
                End = mid - 1;
            }
            mid = Strat + (End - Strat) / 2;
        }
        return ans;
    }

    static int right_occ(int[] arr, int n, int key) {

        int Strat = 0;
        int End = n - 1;
        int ans = -1;
        int mid = Strat + (End - Strat) / 2;
        while (Strat <= End) {
            if (arr[mid] == key) {
                ans = mid;
                Strat = mid + 1;
            } else if (key > arr[mid]) {
                Strat = mid + 1;
            } else {
                End = mid - 1;
            }
            mid = Strat + (End - Strat) / 2;
        }
        return ans;
    }
    static int count(int f,int l){
        return l - f + 1;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,3,3,3,5};
        System.out.println("Number of occ of "+count(left_occ(a,a.length,3),right_occ(a,a.length,3)));
    }
}




