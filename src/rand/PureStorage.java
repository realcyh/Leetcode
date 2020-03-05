package rand;


import java.util.*;

public class PureStorage {
    public static int compute_number_score(int num) {
        int point = 0;
        if (num % 3 == 0) {
            point += 2;
        }
        int[] nums = new int[10];
        int cnt = 0;
        for (int i=0; i<10; i++) {
            nums[i] = num % 10;
            num /= 10;
            if (num == 0) {
                cnt = i;
                break;
            }
        }
        for (int i=cnt; i>=0; i--) {
            if (nums[i] == 7) { point += 1;}
            if (nums[i]%2 == 0) { point += 4;}
        }
        int n = 0;
        for (int i=cnt; i>=0; i--) {
            if (nums[i] == 5) { n += 1;}
            else {
                if (n >= 2) {
                    point += 3*(n-1);
                }
                n = 0;
            }
            if (i == 0 && n >=2) {
                point += 3*(n-1);
            }
        }

        n = 1;

        for (int i=cnt-1; i>=0; i--) {
            if (nums[i] == nums[i+1] - 1) {
                n += 1;
            } else {
                point += n*n;
                n = 1;
            }
            if (i == 0) { point += n*n;}
        }
        if (cnt == 0) {point += 1;}
        return point;
    }

    public static int lock_use_analyzer(String[] locks) {
        int cnt = 0;
        Stack<String> stack = new Stack<>();
        for (int i=0; i<locks.length; i++) {
            if (locks[i].contains("ACQUIRE")) {
                String num = locks[i].split(" ")[1];
                stack.push("RELEASE " + num);
            } else if (stack.isEmpty() && i == 0) {
                cnt = 1; break;
            } else if (!stack.pop().equals(locks[i])) {
                cnt = i+1; break;
            }
        }
        if (!stack.isEmpty()) {
            cnt = locks.length+1;
        }
        return cnt;
    }

    static int check_log_history(List<String> events) {

        int cnt = 0;
        Stack<String> stack = new Stack<>();

        for (int i=0; i<events.size(); i++) {
            if (events.get(i).contains("ACQUIRE")) {
                String num = events.get(i).split(" ")[1];
                if (stack.contains("RELEASE " + num)) {
                    return i+1;
                } else {
                    stack.push("RELEASE " + num);
                }
            } else if (stack.isEmpty() && i == 0) {
                return 1;
            } else if (!stack.pop().equals(events.get(i))) {
                return i+1;
            }
        }
        if (!stack.isEmpty()) {
            cnt = events.size()+1;
        }
        return cnt;


    }

    public static List<Integer> oddNumbers(int l, int r) {
        // Write your code here
        List<Integer> list = new ArrayList<>();
        if (l % 2 == 1) {
            int n = l;
            while (n <= r) {
                list.add(n);
                n += 2;
            }
        } else {
            int n = l+1;
            while (n <= r) {
                list.add(n);
                n += 2;
            }
        }
        return list;
    }

    public static String findNumber(List<Integer> arr, int k) {
        // Write your code here
        if (arr.contains(k)) {return "YES"; }
        else {return "NO"; }

    }


    public static void main(String[] args) {
//        int res1 = compute_number_score(7);
//        System.out.println(res1);
//        String[] test = {"ACQUIRE 123", "RELEASE 123"};
        List<String> s = new ArrayList<>();
        s.add("ACQUIRE 364");
        s.add("ACQUIRE 84");
        s.add("RELEASE 364");
        s.add("RELEASE 84");
        int res = check_log_history(s);
        System.out.println(res);

    }
}
