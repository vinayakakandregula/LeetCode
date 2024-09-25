class Solution {
    public int[] countBits(int n) {
       int res[] = new int[n + 1];
		for (int i = 0; i < res.length; i++) {
			res[i] = rev(i);
		}
        return res; 
    }
    private static int rev(int n) {
		String str = "";
		while (n != 0) {
			str = (n % 2) + str;
			n /= 2;
		}
		int c = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '1') {
				c++;
			}
		}
		return c;
	}
}