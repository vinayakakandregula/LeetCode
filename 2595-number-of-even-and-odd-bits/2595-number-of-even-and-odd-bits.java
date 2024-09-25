class Solution {
    public int[] evenOddBit(int n) {
        String str = "";
		while (n != 0) {
			str = str+(n % 2);
			n /= 2;
		}
		int even = 0, odd = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '1' && i % 2 == 0) {
				even++;
			} else if (str.charAt(i) == '1' && i % 2 == 1) {
				odd++;
			}
		}
		int res[] = new int[2];
		res[0] = even;
		res[1] = odd;
		return res;

    }
}