class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        helper(candidates,target,0,new ArrayList<>());
        return result;
    }
    void helper(int[] can,int target,int index,ArrayList<Integer> curr){
        if(target==0){
            result.add(new ArrayList<>(curr));
            return;
        }
        if(target<0||index==can.length)return;
        for(int i = index;i<can.length;i++){
            if(target<can[i])break;

            if(i>index && can[i]==can[i-1]){
                continue;
            }
            curr.add(can[i]);
            helper(can,target-can[i],i+1,curr);
            curr.remove(curr.size()-1);
        }
    }
}