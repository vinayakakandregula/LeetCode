class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> list = new ArrayList<String>();
		for (int i = 0; i < words.length; i++) {
			int count=0;
			for (int j = 0; j < words.length; j++) {
				if (words[j].indexOf(words[i]) != -1) {
					count++;
				}
			}
			if(count>=2) {
				list.add(words[i]);
			}
		}
        return list;
    }
}