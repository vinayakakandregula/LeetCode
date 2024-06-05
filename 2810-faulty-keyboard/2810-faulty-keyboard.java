class Solution {
    public String finalString(String s) {
        String res = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != 'i') {
				res = res + s.charAt(i);
			} else {
				res = rev(res);
			}
		}
        return res;
    }
    public static String rev(String res) {
		String str = "";
		for (int i = 0; i < res.length(); i++) {
			str = res.charAt(i) + str;
		}
		return str;
	}

}