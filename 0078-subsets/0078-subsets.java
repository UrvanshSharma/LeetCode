class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<Integer> curr = new ArrayList<>();
        helper(nums,0,curr);
        return result;
    }
    void helper(int[] nums,int index,ArrayList<Integer> curr){
        result.add(new ArrayList<>(curr));
        if(index == nums.length){
            return;
        }
        for(int i = index;i<nums.length;i++){
            curr.add(nums[i]);
            helper(nums,i+1,curr);
            curr.remove(curr.size()-1);
    }
    }
}