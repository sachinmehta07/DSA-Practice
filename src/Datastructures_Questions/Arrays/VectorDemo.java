package Datastructures_Questions.Arrays;

import java.util.Vector;

public class VectorDemo {

    public void vectorDemoArray(){

        Vector<Integer> list = new Vector<>();

        list.add(5);
        list.add(4);

        System.out.println(list);
        System.out.println(list.capacity());

    }

    public static void main(String[] args) {
        VectorDemo v1 = new VectorDemo();

        v1.vectorDemoArray();
    }

}
