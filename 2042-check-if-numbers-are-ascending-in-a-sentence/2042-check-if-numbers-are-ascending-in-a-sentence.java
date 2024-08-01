class Solution {
    public boolean areNumbersAscending(String s) {
        String sp[] = s.split(" ");
		int a = 0;
		for (int i = 0; i < sp.length; i++) {
			if (isNumeric(sp[i])) {
				int n = Integer.parseInt(sp[i]);
				if (!(a < n)) {
					return false;

				}
				a = n;
			}
		}
        return true;
    }
    public static boolean isNumeric(String str) {
		try {
			Integer.parseInt(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}