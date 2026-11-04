class Solution {
    List<String> result = new ArrayList<>();
    String[] map = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0)return result;
        StringBuilder curr = new StringBuilder();
        helper(digits,0,curr);
        return result;
    }
    void helper(String digits,int index,StringBuilder curr){
        if(curr.length()==digits.length()){
            result.add(curr.toString());
            return;
        }
        String letters = map[digits.charAt(index)-'0'];
        for(int i = 0;i<letters.length();i++){
            curr.append(letters.charAt(i));
            helper(digits,index+1,curr);
            curr.deleteCharAt(curr.length()-1);
        }
    }
}