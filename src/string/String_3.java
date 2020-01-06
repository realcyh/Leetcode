package string;

import java.util.HashSet;
import java.util.Set;

public class String_3 {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int n = s.length();
        for (int i=0; i<n; i++) {
            for (int j=0; j<=n; j++) {
                if (allUnique(s, i, j)) ans = Math.max(ans, j-i);
            }
        }
        return ans;
    }

    public boolean allUnique(String s, int start, int end) {
        Set<Character> res = new HashSet<>();
        for (int i=start; i<end; i++) {
            if (res.contains(s.charAt(i))) return false;
            res.add(s.charAt(i));
        }
        return true;
    }
    public static void main(String[] args) {

    }
}
