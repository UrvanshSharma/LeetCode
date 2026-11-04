class Solution {

    public String expand(String s) {
        StringBuilder result = new StringBuilder();
        result.append("#");
        for (char ch : s.toCharArray()) {
            result.append(ch);
            result.append("#");
        }
        return result.toString();
    }

    public String longestPalindrome(String s) {

        if (s == null || s.length() == 0) return "";

        char[] str = expand(s).toCharArray();
        int n = str.length;

        int[] p = new int[n];

        int C = 0; // center
        int R = 0; // right boundary

        for (int i = 0; i < n; i++) {

            if (i < R) {
                int mirror = 2 * C - i;
                p[i] = Math.min(p[mirror], R - i);
            }

            while (i + p[i] + 1 < n &&
                   i - p[i] - 1 >= 0 &&
                   str[i + p[i] + 1] == str[i - p[i] - 1]) {
                p[i]++;
            }

            if (i + p[i] > R) {
                C = i;
                R = i + p[i];
            }
        }

        int max = 0;
        int cIdx = 0;

        for (int i = 0; i < n; i++) {
            if (p[i] > max) {
                max = p[i];
                cIdx = i;
            }
        }

        int start = (cIdx - max) / 2;

        return s.substring(start, start + max);
    }
}