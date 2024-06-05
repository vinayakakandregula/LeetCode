class Solution {
    public boolean detectCapitalUse(String s) {
        String upper = s.toUpperCase();
		String lower = s.toLowerCase();
		if(s.equals(lower) || s.equals(upper)) {
            return true;
		}
        String res = "";
		for (int i = 0; i < s.length(); i++) {
			if (i == 0) {
				res = res + s.charAt(i);
			} else {
				res = res + ("" + s.charAt(i)).toLowerCase();
			}
		}
		if(res.equals(s)) {
            return true;
		} else {
            return false;
		}
    }
}