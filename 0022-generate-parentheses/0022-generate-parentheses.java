class Solution {
    ArrayList<String> result = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        String curr = "";
        helper(curr,0,n,0,0);
        return result;
    }
    void helper(String curr,int index,int n,int open,int close){
        if(index==2*n){
            result.add(curr);
            return;
        }
        if(open<n){
            helper(curr+'(',index+1,n,open+1,close);
        }
        if(close<open && close<n){
            helper(curr+')',index+1,n,open,close+1);
        }
    }
}