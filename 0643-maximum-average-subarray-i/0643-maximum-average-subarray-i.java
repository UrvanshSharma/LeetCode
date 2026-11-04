class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i]; 
        }
        
        double maxSum = prefix[k - 1];

        for (int i = k; i < nums.length; i++) {
            int currentSum = prefix[i] - prefix[i - k];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        return maxSum / k;
    }
}