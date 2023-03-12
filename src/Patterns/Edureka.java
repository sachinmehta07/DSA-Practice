package Patterns;

public class Edureka {

    public static void printStars(int n) {

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
    }
    public void py(){
        int n = 4;
        for(int i =1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
       Edureka ed= new Edureka();
       ed.py();
    }
}