class Solution {
    public String reversePrefix(String word, char ch) {
        int j = 0;
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == ch) {
				j = i; 
				break;
			}
		}
		String r = word.substring(0, j + 1);
		String s = word.substring(j+1);
		r = res(r);
        return r+s;
    }
    
	public static String res(String r) {
		String res = "";
		for (int i = 0; i < r.length(); i++) {
			res = r.charAt(i) + res;
		}
		return res;
	}
}