class Solution {
    public String truncateSentence(String s, int k) {
        String sp[] = s.split(" ");
		String res = "";
		for (int i = 0; i < k; i++) {
			res = res + " " + sp[i];
		}
        return res.trim();
    }
}