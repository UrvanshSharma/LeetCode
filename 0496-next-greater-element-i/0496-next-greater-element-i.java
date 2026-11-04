class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int index = 0;
        int[] result = new int[nums1.length];
        while (index < nums1.length) {
            int can = nums1[index];
            result[index]=-1;
            for (int i = 0; i < nums2.length - 1; i++) {
                if (nums2[i] == can) {
                    int itr = i+1;
                    while (itr < nums2.length) {
                        if (nums2[itr] > can) {
                            result[index] = nums2[itr];
                            break;
                        }
                        itr++;
                    }
                    if (itr == nums2.length) {
                        result[index] = -1;
                    }
                    break;
                }
            }
            index++;
        }
        return result;
    }
}