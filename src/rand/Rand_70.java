package rand;

public class Rand_70 {
    public int climbStairs(int n) {
        if (n==1) return 1;
        int[] m = new int[n+1];
        m[1] = 1;
        m[2] = 2;
        for (int i=3; i<=n; i++) {
            m[i] = m[i-1]+m[i-2];
        }
        return m[n];

    }

    public static void main(String[] args) {
        Rand_70 r = new Rand_70();
        System.out.println(r.climbStairs(3));
    }
}
