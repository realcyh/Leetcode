package array;

public class Array_581 {
    public static int partition (int[] nums, int p, int r) {
        int pivot = nums[r];
        int i = p-1;
        for (int j=p; j<r; j++) {
            if (nums[j] <= pivot) {
                i++;
                int key = nums[i];
                nums[i] = nums[j];
                nums[j] = key;
            }
        }
        int key = nums[i+1];
        nums[i+1] = nums[r];
        nums[r] = key;
        return i+1;
    }

    public static void quickSort (int[] nums, int p, int r) {
        if (p<r) {
            int q = partition( nums, p, r);
            quickSort(nums, p, q-1);
            quickSort(nums, q+1, r);
        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 6, 4, 8, 10, 9, 15};
        int[] numsSorted = new int[nums.length];
        for (int i=0; i<numsSorted.length; i++) {
            numsSorted[i] = nums[i];
        }

        quickSort(numsSorted, 0, numsSorted.length-1);
        for (int i:nums) {
            System.out.println(i);
        }
        int indexS = 0, indexE = 0;

        for (int i=0; i<nums.length; i++) {
            if (nums[i] != numsSorted[i]) {
                indexS = i;
                break;
            }
        }
        for (int j=nums.length-1; j>=0; j--) {
            if (nums[j] != numsSorted[j]) {
                indexE = j;
                break;
            }
        }
        int diff = 0;
        if ((indexE-indexS) >0) {
            diff = indexE - indexS +1;
        }

        System.out.println(diff);


    }
}
