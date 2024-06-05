class Solution {
    public boolean isAcronym(List<String> words, String s) {
        int count = 0;
		if (words.size() == s.length()) {
			for (int i = 0; i < words.size(); i++) {
				if (words.get(i).charAt(0) == s.charAt(i)) {
					count++;
				}
			}
		}
		if (count==words.size()) {
			return true;
		}else {
			return false;
		}
    }
}