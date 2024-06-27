class Solution {
    public long countVowels(String word) {
        long totalVowels = 0;
        int n = word.length();
        String vowels = "AEIOUaeiou";

        for (int i = 0; i < n; i++) {
            if (vowels.indexOf(word.charAt(i)) != -1) {
                totalVowels += (long)(i + 1) * (n - i);
            }
        }

        return totalVowels;
    }
}
