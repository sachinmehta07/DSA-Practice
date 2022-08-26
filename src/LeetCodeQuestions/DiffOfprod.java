package LeetCodeQuestions;

import java.util.Scanner;

public class DiffOfprod {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1;
        int b = 1;
        System.out.print(a +" "+b);
        for(int i=1;i<=n;i++){
            int f = a+b;
            System.out.print(" "+f+" ");
            a = b;
            b = f;
        }
    }
}
