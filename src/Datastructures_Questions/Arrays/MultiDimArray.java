package Datastructures_Questions.Arrays;

import java.util.Arrays;

public class MultiDimArray {

    public void mulDimArray(){

        int[][] flats = new int[2][3];

        //ground floor
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;

        //first floor
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;

        //to prints multiDim_array
        for (int i = 0;i<flats.length;i++) {
            //it prints the size of array i
            for (int j =0;j< flats[i].length;j++) {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        MultiDimArray m1 = new MultiDimArray();
        m1.mulDimArray();
    }
}
