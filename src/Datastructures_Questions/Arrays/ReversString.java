package Datastructures_Questions.Arrays;

public class ReversString {
    public static void main(String[] args) {
       /* String[] a = {"SACHIN","MEHTA","RAMESH"};
        rv(a,a.length);*/
        ReversStringFunction("Sachin");
    }
    public static void rv(String[] MainArray, int n){
        String[] SecondCopy = new String[n];
        int temp = n;
        for (int i=0;i<n;i++){
            SecondCopy[temp-1] = MainArray[i];
            temp = temp - 1;
        }
        for (int k=0;k<n;k++){
            System.out.println(SecondCopy[k]);
        }
    }
    static void ReversStringFunction(String str){
        StringBuilder sb = new StringBuilder(str);
        System.out.println("string = " + sb);
        System.out.println("reverse = " + sb.reverse());
    }
}
