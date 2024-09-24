class Solution {
    public int countWords(String[] words1, String[] words2) {
        words1 = removeDup(words1);
		words2 = removeDup(words2);
		int count = 0;
		for (int i = 0; i < words1.length; i++) {
			for (int j = 0; j < words2.length; j++) {
				if(words1[i].equals(words2[j])) {
					count++;
					break;
				}
			}
		}
        return count;
    }
    private static String[] removeDup(String[] words1) {
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < words1.length; i++) {
			int count = 0;
			for (int j = 0; j < words1.length; j++) {
				if (words1[i].equals(words1[j]) && i > j) {
					break;
				}
				if (words1[i].equals(words1[j])) {
					count++;
				}
			}
			if (count == 1) {
				list.add(words1[i]);
			}
		}
		String[] res = new String[list.size()];
		for (int i = 0; i < res.length; i++) {
			res[i] = list.get(i);
		}
		return res;
	}
}