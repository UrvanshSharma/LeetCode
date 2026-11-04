class Solution {
    public int largestAltitude(int[] gain) {
        
        int[] pre= new int[gain.length+1];
        pre[0]=gain[0];
        for(int i=1;i<gain.length;i++){
            pre[i]=pre[i-1]+gain[i];
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<pre.length;i++){
            if(pre[i]>max){
                max=pre[i];
            }
        }
        return max;
    }
}