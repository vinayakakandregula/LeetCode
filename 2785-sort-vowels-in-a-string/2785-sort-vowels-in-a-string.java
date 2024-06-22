class Solution {
    public String sortVowels(String s) {
        char ch[] = s.toCharArray();
		String vowel = "AEIOUaeiou";
		ArrayList<String> set = new ArrayList<String>();
		for (int i = 0; i < ch.length; i++) {
			if (vowel.indexOf(ch[i]) != -1) {
				set.add("" + ch[i]);
			}
		}
		Collections.sort(set);
		Iterator<String> itr = set.iterator();
		String str = "";
		for (int i = 0; i < ch.length; i++) {
			if (vowel.indexOf(ch[i]) != -1) {
				if(itr.hasNext()) {
					str = str + itr.next();
				}
			} else {
				str = str + ch[i];
			}
		}
        return str;
    }
}