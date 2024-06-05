class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int res =0;
		for (int i = 0; i < words.length; i++) {
			int count = 0;
			for (int j = 0; j < words[i].length(); j++) {
				if(allowed.indexOf(words[i].charAt(j))!=-1){
					count++;
				}
			}
			if(count==words[i].length()) {
				res++;
			}
		}
        return res;
    }
}