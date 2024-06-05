class Solution {
    public String sortSentence(String s) {
        String sp[] = s.split(" ");
		String res[] = new String[sp.length];
		String r = "";
		for (int i = 0; i < sp.length; i++) {
			int j = Integer.parseInt(("" + sp[i].charAt(sp[i].length() - 1)));
			System.out.println(j - 1);
			res[j - 1] = sp[i].substring(0, sp[i].length() - 1);
		}
		for (int i = 0; i < res.length; i++) {
			r = r+" " + res[i];
		}
        return r.trim();
    }
}