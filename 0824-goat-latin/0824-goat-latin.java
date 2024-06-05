class Solution {
    public String toGoatLatin(String sentence) {
        String sp[] = sentence.split(" ");
		String m = "maa";
		String res = "";
		for (int i = 0; i < sp.length; i++) {
			if (vowel(sp[i])) {
				res = res + " " + sp[i] + m;
				m = m + "a";
			} else {
				String r = sp[i].substring(1);
				res = res + " " + r + sp[i].charAt(0) + m;
				m = m + "a";
			}
		}
        return res.trim();
    }
    public static boolean vowel(String string) {
		String vowel = "AEIOUaeiou";
		if (vowel.indexOf(string.charAt(0)) != -1) {
			return true;
		}
		return false;
	}

}