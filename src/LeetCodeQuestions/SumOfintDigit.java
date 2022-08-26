package LeetCodeQuestions;

public class SumOfintDigit {
    public static void main(String[] args) {
        System.out.println(digitsum(123));
    }
    public static int digitsum(int n){
        int sum = 0;
        while(n!=0){
            int digit = n%10;
            sum = sum + digit;
            n = n/10;
        }
        return sum;
    }
}
