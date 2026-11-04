class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        HashSet<Integer> seen = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=min){
                min=nums[i];
            }
            if(nums[i]>=max){
                max=nums[i];
            }
            seen.add(nums[i]);
        }
        for(int i=min;i<=max;i++){
            if(seen.contains(i)){continue;}
            ans.add(i);
        }
        return ans;
    }
}