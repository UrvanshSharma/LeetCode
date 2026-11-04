class Solution {
    List<List<Integer>> result =  new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        ArrayList<Integer> curr = new ArrayList<>();
        helper(n,k,curr,1);
        return result;
    }
    void helper(int n,int k,ArrayList<Integer> curr,int index){
        if(curr.size()==k){
            result.add(new ArrayList<>(curr));
            return;
        }
        for(int i = index;i<=n;i++){
            curr.add(i);
            helper(n,k,curr,i+1);
            curr.remove(curr.size()-1);
        }
    }
}