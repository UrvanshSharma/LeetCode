class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";

        int len = 0;

        for (int i = 0; i < strs[0].length(); i++) {
            char ch = strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != ch) {
                    return strs[0].substring(0, len);
                }
            }

            len++;
        }

        return strs[0].substring(0, len);
    }
}