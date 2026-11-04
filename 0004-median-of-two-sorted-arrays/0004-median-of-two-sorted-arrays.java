class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> combined = new ArrayList<>();
        
        for (int i : nums1) {
            combined.add(i);
        }
        for (int i : nums2) {
            combined.add(i);
        }
        
        Collections.sort(combined);
        
        int c = combined.size();
        if (c % 2 == 0) {
            return (combined.get(c / 2 - 1) + combined.get(c / 2)) / 2.0;
        } else {
            return combined.get(c / 2);
        }
    }
}