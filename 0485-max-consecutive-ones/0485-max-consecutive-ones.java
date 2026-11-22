class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int can = 1;
        int count = 0;
        int maxcount=0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==can){
                count++;
                maxcount=Math.max(maxcount,count);
            }
            else count=0;
        }
        return maxcount;
    }
}