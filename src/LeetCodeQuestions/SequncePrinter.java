package LeetCodeQuestions;

import java.util.Scanner;

public class SequncePrinter {
        public static void main(String[] args) {
            int sequence=1;

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the length of sequence: ");

            int n = sc.nextInt();
            while(n!=0)
            {
                System.out.print(sequence+" ");
                sequence = sequence * 2;
                n = n - 1;
            }
        }
    }
