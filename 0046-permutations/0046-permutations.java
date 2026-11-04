class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        helper(nums,0);
        return result;
    }
    void helper(int[] nums,int index){
        if(index == nums.length){
            List<Integer>curr = new ArrayList();
            for(int  i =0;i<nums.length;i++){
                curr.add(nums[i]);
            }
            result.add(curr);
            return;
        }
        for(int i = index ; i < nums.length;i++){
            int temp = nums[index];
            nums[index] = nums[i];
            nums[i] = temp;
            helper(nums,index+1);
            temp = nums[index];
            nums[index] = nums[i];
            nums[i] = temp;
        }
    }
}