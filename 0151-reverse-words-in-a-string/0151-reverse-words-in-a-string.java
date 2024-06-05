class Solution {
    public String reverseWords(String s) {
        String sp[] = s.split(" ");
		String res = "";
		for (int i = 0; i < sp.length; i++) {
            if(!sp[i].equals("")) {
				res = sp[i] + " " + res;
			}
		}
        return res.trim();
    }
}