class Solution {
    public boolean isPalindrome(int x) {
        String s = ""+x;
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			res = s.charAt(i)+res;
		}
        return s.equals(res);
    }
}