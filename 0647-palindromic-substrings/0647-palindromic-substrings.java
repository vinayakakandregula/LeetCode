class Solution {
    public int countSubstrings(String str) {
        int n = str.length();
        int count = 0;
        
        for (int center = 0; center < 2 * n - 1; center++) {
            int left = center / 2;
            int right = left + center % 2;
            
            while (left >= 0 && right < n && str.charAt(left) == str.charAt(right)) {
                count++;
                left--;
                right++;
            }
        }
        
        return count;
    }
}
