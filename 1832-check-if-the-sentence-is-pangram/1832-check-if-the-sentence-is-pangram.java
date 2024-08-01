class Solution {
    public boolean checkIfPangram(String sentence) {
        int count = 0;
		String res = "";
		for (int i = 0; i < sentence.length(); i++) {
			String s = sentence.charAt(i) + "";
			if (!(res.contains(s)) && (sentence.charAt(i) >= 'a' || sentence.charAt(i) <= 'z'
					|| sentence.charAt(i) >= 'A' || sentence.charAt(i) <= 'Z')) {
				count++;
			}
			res+=s;
		}
       return count==26;
    }
}