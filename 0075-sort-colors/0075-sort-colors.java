class Solution {
    public void sortColors(int[] nums) {
        
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                index++;
            }
        }
        index=nums.length-1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == 2) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                index--;
            }
        }
    }
}