class Solution {
    public int longestOnes(int[] nums, int k) {
        int count = 0;
        int start = 0;
        int len = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0) {
                count++;
            }

            while (count > k) {
                if (nums[start] == 0) {
                    count--;
                }
                start++;
            }

            len = Math.max(len, i - start + 1);
        }

        return len;
    }
}