class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
		int res[] = new int[n];
		int index = s.indexOf(c);
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c) {
				index = i;
			}
			res[i] = Math.abs(i - index);
		}
		for (int i = n - 1; i >= 0; i--) {
			if (s.charAt(i) == c) {
				index = i;
			}
			res[i] = Math.min(res[i], Math.abs(i - index));
		}
        return res;
    }
}