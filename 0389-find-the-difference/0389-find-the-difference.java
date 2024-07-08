class Solution {
    public char findTheDifference(String s, String t) {
        int n=0;
        for (int i = 0; i < t.length(); i++) {
				n += t.charAt(i);
		}
		for (int i = 0; i < s.length(); i++) {
				n -= s.charAt(i);
		}
        return (char) n;
        }
}