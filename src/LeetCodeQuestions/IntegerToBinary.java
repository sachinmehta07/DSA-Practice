package LeetCodeQuestions;


public class IntegerToBinary {
    public static void main(String[] args) {
        int n = 5;
        int i = 0;
        int rem;
        int[] arr1 = new int[10];
        while (n!=0){
            rem = n%2;
            n = n/2;
            arr1[i] = rem;
            i++;
        }
        for(int j=i-1;j>=0;j--){
            System.out.print(arr1[j]);
        }
    }
}