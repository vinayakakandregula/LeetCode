class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        if(combine(word1).equals(combine(word2))) {
            return true;
		} else {
            return false;
        }
    }
    public static String combine(String[] word1) {
		String res = "";
		for (String string : word1) {
			res += string;
		}
		return res;
	}

}