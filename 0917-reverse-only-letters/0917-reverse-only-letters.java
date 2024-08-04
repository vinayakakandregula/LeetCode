class Solution {
    public String reverseOnlyLetters(String s) {
        List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < s.length(); i++) {
			if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) {
				list.add(i);
			}
		}
		char[] ch = s.toCharArray();
		for (int i = 0, j = list.size() - 1; i < list.size() / 2; i++) {
			char temp = ch[list.get(i)];
			ch[list.get(i)] = ch[list.get(j)];
			ch[list.get(j)] = temp;
			j--;
		}
        return new String(ch);
    }
}