class Solution {
    public int mostWordsFound(String[] sentences) {
        int res =0;
		for (int i = 0; i < sentences.length; i++) {
			String sp[] = sentences[i].split(" ");
			if(sp.length>res) {
				res=sp.length;
			}
		}
        return res;
    }
}