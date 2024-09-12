class Solution {
    public String reverseVowels(String s) {
        char[] strArr = s.toCharArray();
        
        int left = 0, right = s.length() - 1;
        
        while (left < right) {
            while (left < right && !isVowel(strArr[left])) {
                left++;
            }
            while (left < right && !isVowel(strArr[right])) {
                right--;
            }
            char temp = strArr[left];
            strArr[left] = strArr[right];
            strArr[right] = temp;
            
            left++;
            right--;
        }
        
        return new String(strArr);
    }
    
    private boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}
