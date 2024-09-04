class Solution {
    public String greatestLetter(String s) {
		String res = "";
		char c = ' ';
		for (int i = 0; i < s.length(); i++) {
			char ch = (char) (s.charAt(i) + 32);
			if (s.indexOf(ch) != -1 && c < ch) {
				res = s.charAt(i) + "";
				c = ch;
			}
		}
        return res;
    }
}