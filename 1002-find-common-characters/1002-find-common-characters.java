class Solution {
    public List<String> commonChars(String[] words) {
        List<String> al = new ArrayList<String>();
		for (int i = 0; i < words[0].length(); i++) {
			int count = 0;
			for (int j = 1; j < words.length; j++) {
				if (words[j].indexOf(words[0].charAt(i)) != -1) {
					words[j] = words[j].replaceFirst(words[0].charAt(i) + "", "");
					count++;
				}
			}
			if (count == words.length - 1) {
				al.add(words[0].charAt(i) + "");
			}

		}
        return al;
    }
}