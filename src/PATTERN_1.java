package PATTERNS;

import java.util.Scanner;
public class PATTERN_1 {

    public static void main(String[] args) {
        PATTERN_1 PT = new PATTERN_1();
        PT.PT_16();
    }

    public void PT_1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("* ");
        }
    }

    public void PT_2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void PT_3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        int w = 1;

// --> using while loop
        while (w <= n) {
            int k = 1;
            while (k <= n) {
                System.out.print(k); // for revers order n-k+1  4321
                k++;
            }
            System.out.println();
            w++;
        }
// --> using for loop
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
//        12345
//        12345
//        12345
//        12345
//        12345
    }

    public void PT_4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(count++);
            }
            System.out.println();
        }
//        123
//        456
//        789
    }

    // triangle star
    public void PT_5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
//*
//**
//***
//****
//*****
    }

    public void PT_6() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        int count = 1;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(count++);
            }
            System.out.println();
        }
//        1
//        23
//        456
//        78910
    }

    public void PT_7() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
//            int count = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(j + i - 1);
            }
            System.out.println();
        }
//        1
//        23
//        345
//        4567
    }

    public void PT_8() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int count = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(count++); // USE i - j + 1 if i want to print it without using COUNT
            }
            System.out.println();
        }
//        1
//        21
//        321
//        4321
    }

    // new patterns ABC
    public void PT_9() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                char ch = (char) ('A' + i - 1); //'A' + i -1 if ABC/ABC/ABC //
                System.out.print(ch);
            }
            System.out.println();
        }
//        AAAA /BBBB /CCCC /DDDD
    }

    public void PT_10() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                char start = ch++;
                System.out.print(start);
            }
            System.out.println();
        }
//        ABCD
//        EFGH
//        IJKL
//        MNOP
    }

    public void PT_11() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                char ch = (char) ('A' + i + j - 2);
                System.out.print(ch);
            }
            System.out.println();
        }
//        ABCD
//        BCDE
//        CDEF
//        DEFG
    }

    public void PT_12() {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the value ");
        int n = SC.nextInt();
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                char val = (char) (ch + i - 1); // for A/BC/DEF/GHIJ U CAN USE CH++ JUST INCREMENT VALUE OF CH
                System.out.print(val);
            }
            System.out.println();
        }
//        A
//        BB
//        CCC
//        DDDD

    }

    public void PT_13() {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the value ");
        int n = SC.nextInt();
        char ch = 'A';

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                char val = (char) (ch + i + j - 2);
                System.out.print(val);
            }
//            A
//            BC
//            CDE
//            DEFG
            System.out.println();
        }
    }
// star print with spaces

    public void PT_14() {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the value ");
        int n = SC.nextInt();

        int i, j;

        for (i = 0; i < n; i++) {

            for (j = 2 * (n - i); j >= 0; j--) { //For Loop for Row

                System.out.print(" "); // Print Spaces

            }

            for (j = 0; j <= i; j++) { //For Loop for col

                System.out.print("* "); // Print Star

            }

            System.out.println();

        }
//         *
//       * *
//     * * *
//   * * * *
    }

    public void PT_15() {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the value ");
        int n = SC.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
//****
//***
//**
//*
            System.out.println();
        }
    }

    public void PT_16() {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the value ");
        int n = SC.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" "); // Prints Blank space
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*"); //Prints *
            }
//****
// ***
//  **
//   *
            System.out.println(" "); //Prints blank spaces
        }

    }
}

