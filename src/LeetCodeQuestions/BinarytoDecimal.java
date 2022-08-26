package LeetCodeQuestions;

import java.util.Scanner;

import static java.lang.Math.pow;

public class BinarytoDecimal {

    public static void main(String[] args) {
        int binaryNumber,decimalNumber=0,rem,i=0;
        Scanner sc = new Scanner(System.in);
        binaryNumber = sc.nextInt();

        while (binaryNumber!=0){
            rem=binaryNumber%10;
            decimalNumber= (int) (decimalNumber+(rem*pow(2,i)));
            i++;
            binaryNumber=binaryNumber/10;
        }
        System.out.println(decimalNumber);
    }
}
