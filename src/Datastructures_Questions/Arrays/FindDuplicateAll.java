package Datastructures_Questions.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDuplicateAll {
    public static List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums);
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == nums[i + 1]) {
                res.add(nums[i]);
                i += 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,4,5,3};
        System.out.println(findDuplicates(a));
    }
}
