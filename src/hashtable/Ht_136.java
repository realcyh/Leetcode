package hashtable;

public class Ht_136 {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3,1};
        int result = 0;
        for (int i: nums) {
            result ^= i;
        }
        System.out.println(result);
    }
}
