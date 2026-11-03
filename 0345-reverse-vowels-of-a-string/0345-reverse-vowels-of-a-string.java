class Solution {
    public boolean isVowel(char c){
        return "aeiouAEIOU".indexOf(c) != -1;
    }
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            while (left < right && !isVowel(arr[left])) {
                left++;
            }
            while (left < right && !isVowel(arr[right])) {
                right--;
            }

            if(isVowel(arr[left]) && isVowel(arr[right])){
                char temp = arr[left];
                arr[left++]=arr[right];
                arr[right--]=temp;
            }
        }   
        return new String(arr);
    }
}