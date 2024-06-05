class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String sp[] = text.split(" ");
		int count = 0;
		for (String string : sp) {
			int c=0;
			for (int i = 0; i < brokenLetters.length(); i++) {
				if(string.indexOf(brokenLetters.charAt(i))!=-1) {
					c++;
				}
			}
			if(c==0) {
				count++;
			}
		}
        return count;
    }
}