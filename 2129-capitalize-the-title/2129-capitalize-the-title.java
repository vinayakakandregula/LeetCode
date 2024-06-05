class Solution {
    public String capitalizeTitle(String title) {
        String sp[] = title.split(" ");
		String res = "";
		for (int i = 0; i < sp.length; i++) {
            if (sp[i].length() > 2) {
				res = res + " " + sp[i].substring(0, 1).toUpperCase() + sp[i].substring(1).toLowerCase();
			} else {
				res = res + " " + sp[i].toLowerCase();
			}

		}
        return res.trim();
    }
}