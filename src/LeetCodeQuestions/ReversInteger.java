package LeetCodeQuestions;


public class ReversInteger {

    public static void main(String[] args){
        System.out.println(ReversInt(123));
    }
    public static int ReversInt(int m){
        int ans=0;
        while (m!=0){
            int digit = m%10;
            if((ans> Integer.MAX_VALUE/10)||(ans< Integer.MIN_VALUE/10)){
                return 0;
            }
            ans = (ans*10)+digit;
            m=m/10;

        }
        return ans;
    }

}
