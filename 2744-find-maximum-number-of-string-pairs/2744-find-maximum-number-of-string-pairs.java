class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
		int c = 0;
		for (int i = 0; i < words.length; i++) {
			for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(rev(words[j]))) {
					c++;
				}
			}
		}
        return c;
    }
    public static String rev(String string) {
		String res = "";
		for (int i = 0; i < string.length(); i++) {
			res = string.charAt(i) + res;
		}
		return res;
	}
}