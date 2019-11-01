package rand;

import java.util.ArrayList;
import java.util.List;

public class Rand_448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> l = new ArrayList<Integer>();

        for (int i=0; i<nums.length; i++) {
            int val = Math.abs(nums[i]) - 1;
            if (nums[val]>0) {
                nums[val] = -nums[val];
            }
        }
        for (int i=0; i<nums.length; i++) {
            if (nums[i]>0) {
                l.add(i+1);
            }
        }
        return l;


    }

    public static void main(String[] args) {
        Rand_448 r = new Rand_448();
        int[] nums = {4,3,3,3};
        List<Integer> numsList = new ArrayList<Integer>();
        int max = 0;
        for (int i=0; i<nums.length; i++) {
            numsList.add(nums[i]);
        }
        List<Integer> l = new ArrayList<Integer>();
        for (int i=1; i<=nums.length; i++) {
            l.add(i);
        }
        l.removeAll(numsList);
        System.out.println(l);


    }

}
