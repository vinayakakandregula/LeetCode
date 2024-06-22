class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = words.length;
        int[] prefixCounts = new int[n + 1];

        for (int i = 0; i < n; i++) {
            prefixCounts[i + 1] = prefixCounts[i] + (isVowelString(words[i]) ? 1 : 0);
        }

        int[] res = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            res[i] = prefixCounts[end + 1] - prefixCounts[start];
        }

        return res;
    }

    private boolean isVowelString(String word) {
        String vowels = "AEIOUaeiou";
        int len = word.length();
        return vowels.indexOf(word.charAt(0)) != -1 && vowels.indexOf(word.charAt(len - 1)) != -1;
    }
}
