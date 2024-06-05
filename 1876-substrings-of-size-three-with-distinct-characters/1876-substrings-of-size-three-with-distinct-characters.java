class Solution {
    public int countGoodSubstrings(String s) {
        int count = 0;
		for (int i = 0; i < s.length() - 2; i++) {
			String str = s.substring(i, i + 3);
			if (occ(str)) {
				count++;
			}
		}
        return count;
    }
    public static boolean occ(String str) {
		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int count = 0;
			for (int j = 0; j < ch.length; j++) {
				if (ch[i] == ch[j] && i > j) {
					break;
				}
				if (ch[j] == ch[i]) {
					count++;
				}
			}
			if(count>1) {
				return false;
			}
		}
		return true;
	}

}