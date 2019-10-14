package array;

public class Array_283 {
    public static void main(String[] args) {
        int[] nums = {1,0,3,0,5};
        for (int i=0; i<nums.length; i++) {
            if (nums[i] == 0) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] != 0) {
                        nums[i] = nums[j];
                        nums[j] = 0;
                        break;
                    }

                }
            }
        }
        for (int elem : nums) {
            System.out.println(elem);
        }

    }
}
