class Solution {
    List<List<Integer>> result =  new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        Set<String> set = new HashSet<>();
        helper(nums,0,set);
        return result;
    }
    void helper(int[] nums,int index,Set<String> set){
        if(index == nums.length){
            String key = Arrays.toString(nums);
            if(set.contains(key)){
                return;
            }
            set.add(key);
            List<Integer> curr = new ArrayList<>();
            for(int i = 0;i<nums.length;i++){
                curr.add(nums[i]);
            }
            result.add(curr);
            return;
        }
        for(int i = index;i<nums.length;i++){
             int temp = nums[index];
            nums[index] = nums[i];
            nums[i] = temp;
            helper(nums,index+1,set);
            temp = nums[index];
            nums[index] = nums[i];
            nums[i] = temp;
        }
    }
}