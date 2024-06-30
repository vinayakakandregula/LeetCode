class Solution {
    public String arrangeWords(String text) {
        String sp[] = text.split(" ");
		Arrays.sort(sp, Comparator.comparingInt(String::length));
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < sp.length; i++) {
			if (i == 0) {
				String dup = sp[i];
				sb.append(Character.toUpperCase(dup.charAt(0)) + dup.substring(1) + " ");
			} else {
				sb.append(sp[i].toLowerCase() + " ");
			}
		}
        return sb.toString().substring(0, sb.length()-1);
    }
}