class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character> set = new HashSet<Character>();
		int count = 0;
		for (int i = 0; i < word.length(); i++) {
			char ch = (char) (word.charAt(i)+32);
			if (word.indexOf(ch) != -1 && !(set.contains(ch))) {
				set.add(ch);
				count++;
			}
		}
        return count;
    }
}