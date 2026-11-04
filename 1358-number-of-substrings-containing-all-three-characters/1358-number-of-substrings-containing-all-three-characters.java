class Solution {
    public int numberOfSubstrings(String s) {
        int[] check = {0,0,0};
        int n=s.length();
        int l=0;
        int count=0;
        int res=0;
        for(int r=0;r<n;r++){
            char ch = s.charAt(r);
            if(check[ch-'a']==0){
                count++;
            }
            check[ch-'a']++;
            while(count==3){
                res+=n-r;
                check[s.charAt(l)-'a']--;
                if(check[s.charAt(l)-'a']==0)count--;
                l++;
            }
        }
        return res;
    }
}