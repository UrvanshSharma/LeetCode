class Solution {
    public String toBinary(int n){
        if(n==0)return "0";
        StringBuilder s = new StringBuilder();
        while(n>0){
            s.append(n%2);
            n/=2;
        }
        return s.toString();
    }
    public int hammingWeight(int n) {
        char[] arr = toBinary(n).toCharArray();
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]=='1')count++;
        }
        return count;
    }
}