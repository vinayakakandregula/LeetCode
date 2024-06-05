class Solution {
    public String[] findWords(String[] words) {
        String first = "qwertyuiop";
		String second = "asdfghjkl";
		String third = "zxcvbnm";
		int c=0;
		int k=0;
		for (int i = 0; i < words.length; i++) {
			int count = 0;
			int count1 = 0;
			int count2 = 0;
			for (int j = 0; j < words[i].length(); j++) {
				String s = words[i].toLowerCase();
				if (first.indexOf(s.charAt(j)) != -1) {
					count++;
				} else if (second.indexOf(s.charAt(j)) != -1) {
					count1++;
				}
				else if (third.indexOf(s.charAt(j)) != -1) {
					count2++;
				}

			}
			if (count == words[i].length() || count1 == words[i].length() || count2 == words[i].length()) {
				c++;
			}
		}
		String str[] =  new String[c];
		for (int i = 0; i < words.length; i++) {
			int count = 0;
			int count1 = 0;
			int count2 = 0;
			for (int j = 0; j < words[i].length(); j++) {
				String s = words[i].toLowerCase();
				if (first.indexOf(s.charAt(j)) != -1) {
					count++;
				} else if (second.indexOf(s.charAt(j)) != -1) {
					count1++;
				}
				else if (third.indexOf(s.charAt(j)) != -1) {
					count2++;
				}

			}
			if (count == words[i].length() || count1 == words[i].length() || count2 == words[i].length()) {
				str[k++] = words[i];
			}
		}
        return str;
    }
}