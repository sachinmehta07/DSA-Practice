package Datastructures_Questions.Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Copy {
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> h = new HashMap<>();
        Set<Integer> s = new HashSet<>();
        for(int a : arr)
            h.put(a, h.getOrDefault(a,0)+1);
        boolean flag = true;
        for( Map.Entry<Integer, Integer> e : h.entrySet()){
            if(s.contains(e.getValue()))
            {
                flag = false;
                break;
            }
            else
                s.add(e.getValue());
        }
        return flag;
    }
    public static void main(String[] args) {
        int[] a = {1,2,2,1,1,3,3};
        System.out.println(uniqueOccurrences(a));
    }
}