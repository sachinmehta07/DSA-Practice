package LeetCodeQuestions;

import java.util.Scanner;

public class primeFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("ENTER THE NUMBER TO CHECK PRIME");
        int n =  sc.nextInt();
        for (int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count == 2){
            System.out.println("Number is Prime");
        }else {
            System.out.println("Number is not Prime");
        }
    }
}
