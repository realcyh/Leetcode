package math;

public class Math_279 {
    public static int dp(int total, int i) {
        // top-down
        int num = 0;
        if (total < 0) return 1000000;
        if (total == 0) return 0;
        if ( i < 1) return 1000000;
        num = Math.min( dp(total, i-1), dp(total - i*i, i) + 1);
        return num;
    }

    public static void main(String[] args) {
        int n=25;
        int num1 = 0, num2 = 0;

        num1 = dp(n, (int)Math.sqrt(n));

        System.out.println(num1);

        // bottom up
        if (n<=0) num2 = 0;
        else {
            int[] result = new int[n + 1];
            result[0] = 0;
            for (int i = 1; i <= n; i++) {
                result[i] = Integer.MAX_VALUE;
            }

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j * j <= i; j++) {
                    result[i] = Math.min(result[i], result[i - j * j] + 1);
                }

            }
            num2 = result[n];
        }
        System.out.println(num2);

    }




}
