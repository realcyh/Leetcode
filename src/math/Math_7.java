package math;

public class Math_7 {
    public static void main(String[] args) {
        int x = -2147483648;
        int reverse = 0;
        while (x != 0) {
            if (reverse > Integer.MAX_VALUE/10 || (reverse == Integer.MAX_VALUE/10 && x%10 >7)) {
                break;
            }
            if (reverse < Integer.MIN_VALUE/10 || (reverse == Integer.MIN_VALUE/10 && x%10 < -8)) {
                break;
            }
            reverse = reverse*10 + x%10;
            x /= 10;
        } 

        System.out.println(reverse);
    }
}
