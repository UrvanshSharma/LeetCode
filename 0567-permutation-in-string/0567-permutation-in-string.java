class Solution {
    public boolean isPerm(String s1,String s2){
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        char[] a = s1.toCharArray();
        char[] b= s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        for(char c:a){
            freq1[c-'a']++;
        }
        for(char c:b){
            freq2[c-'a']++;
        }
        for(int i = 0;i<26;i++){
            if(freq1[i]!=freq2[i]){
                return false;
            }
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        int window = s1.length();
        
        int start = 0;
        int end = start+window;
        while(end<=s2.length()){
            if(isPerm(s1,s2.substring(start,end))){
                return true;
            }
            start++;
            end++;
        }
        return false;
    }
}