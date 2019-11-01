package math;

public class Math_258 {
    public int addDigits(int num) {
        if (num==0) return 0;
        int a = num % 9;
        switch (a) {
            case 1: return 1;
            case 2: return 2;
            case 3: return 3;
            case 4: return 4;
            case 5: return 5;
            case 6: return 6;
            case 7: return 7;
            case 8: return 8;
            case 0: return 9;
        }
        return 0;
    }

    public static void main(String[] args) {
        Math_258 m = new Math_258();
        int num = 89;
        System.out.println(m.addDigits(num));
    }
}
