class Solution {
    public long countSubstrings(String s, char c) {
         long count = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        count = count*(count+1)/2;
        return count;
    }
}