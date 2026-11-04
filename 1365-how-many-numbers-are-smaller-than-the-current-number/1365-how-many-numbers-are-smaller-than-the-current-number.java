class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] arr = nums.clone();
        Arrays.sort(arr);

        int[] result = new int[n];

        for(int i = 0; i < n; i++) {
            int count = 0;

            for(int j = 0; j < n; j++) {
                if(nums[i] > arr[j]) {
                    count++;
                }
            }

            result[i] = count;
        }

        return result;
    }
}