class Solution {
    public String firstPalindrome(String[] words) {
        String res ="";
		for (int i = 0; i < words.length; i++) {
			if(check(words[i])) {
				res+=words[i];
				break;
			}
		}
        return res;
    }
    public static boolean check(String string) {
		String res  = "";
		for (int i = 0; i < string.length(); i++) {
			res = string.charAt(i)+res;
		}
		return res.equals(string);
	}

}