package Datastructures_Questions.BinarySearch;

public class squereRoot_Of_givenNumber {
    static  long getRootBs(int n){
        long s = 0;
        long e = n;
        long  mid = s+(e-s)/2;
        long ans  = -1;
        while (s<=e){
           long  square = mid*mid;
            if(square == n){
                return mid;
            }else if(square < n){
                ans = mid;
                s = mid +1;
            }else{  
                e = mid -1;
            }
            mid = s+(e-s)/2;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("SquareRoot Of givenNumber "+getRootBs(25));
    }
}
