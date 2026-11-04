class Solution {
    public int maxArea(int[] height) {
        int vol = 0 ;
        int n = height.length;
        int j = n-1;
        int i =0;
        while(i<j){
            int min = Math.min(height[i],height[j]);
            if(min*(j-i)>=vol){
                vol = min*(j-i);    
            }
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return vol;

    }
}