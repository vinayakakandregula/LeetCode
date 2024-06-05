class Solution {
    public boolean isSubstringPresent(String s) {
		String res = rev(s);
		System.out.println(res);
		for (int i = 0; i < s.length()-1; i++) {
				String s1 = "" + s.charAt(i) + s.charAt(i+1);
				if (res.indexOf(s1) != -1) {
                    return true;
				}
			
		}
        return false;
    }
    public static String rev(String s) {
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			res = s.charAt(i) + res;
		}
		return res;

	}

}