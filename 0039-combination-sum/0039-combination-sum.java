class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        helper(candidates,target,0,new ArrayList<>());
        return result;
    }
    void helper(int[] can,int target,int index,ArrayList<Integer> curr){
        if(target==0){
            result.add(new ArrayList<>(curr));
            return;
        }
        if(target<0||index==can.length)return;
        curr.add(can[index]);
        helper(can,target-can[index],index,curr);
        curr.remove(curr.size()-1);
        helper(can,target,index+1,curr);
    }
}