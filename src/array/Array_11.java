package array;

import java.util.HashMap;

public class Array_11 {
    public static void main(String[] args) {
        // brute force
        int[] height = {1,8,6,2,5,4,8,3,7};
        int max = 0;
//        for (int i=0; i<height.length; i++) {
//            for (int j=i+1; j<height.length; j++) {
//                max = Math.max(max,(Math.min(height[i], height[j]))*(j-i));
//            }
//        }
//        System.out.println(max);

        // two pointer
        int l = 0;
        int r = height.length-1;
        while (l<r) {
            max = Math.max(max, (Math.min(height[l], height[r]))*(r-l));
            if (height[l]<height[r]) {
                l++;
            } else {
                r--;
            }
        }
        System.out.println(max);

    }
}
