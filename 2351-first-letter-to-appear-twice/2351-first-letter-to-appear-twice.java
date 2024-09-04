class Solution {
    public char repeatedCharacter(String s) {
        char ch = ' ';
		char[] c = s.toCharArray();
		Set<Character> set = new HashSet<Character>();
		for (int i = 0; i < c.length; i++) {
			if (set.contains(s.charAt(i))) {
				ch = s.charAt(i);
                break;
			} else {
				set.add(s.charAt(i));
			}
		}
		return ch;
    }
}