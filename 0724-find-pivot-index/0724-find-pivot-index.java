class Solution {
    public int pivotIndex(int[] nums) {
        int leftsum=0;
        int totalsum=0;
        for(int i=0;i<nums.length;i++){
            totalsum+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(i!=0){
                leftsum+=nums[i-1];
            }
            int rightsum=totalsum-nums[i]-leftsum;
            if(rightsum==leftsum)return i;
        }
        return -1;
    }
}