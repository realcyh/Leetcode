package rand;

public class Rand_198 {
    public int rob(int[] nums) {
        if (nums.length<=0) return 0;
        int[] v = new int[nums.length];
        v[0] = nums[0];
        if (nums.length==1) return v[0];
        if (nums[1] > nums[0]) {
            v[1] = nums[1];
        } else {
            v[1] = nums[0];
        }
        if (nums.length == 2) return v[1];

        for (int i=2; i<v.length; i++) {
            v[i] = Math.max(v[i-1], v[i-2]+nums[i]);
        }
        return v[v.length-1];

    }

    public static void main(String[] args) {
        Rand_198 r = new Rand_198();
        int[] nums = {2,7,9,3,1};
        System.out.println(r.rob(nums));


    }
}
