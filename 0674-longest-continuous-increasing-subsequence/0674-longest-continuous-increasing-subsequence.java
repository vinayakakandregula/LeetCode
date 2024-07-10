class Solution {
    public int findLengthOfLCIS(int[] a) {
        int f = 0, l = 0, f1 = 0, n = 0;
		for (int i = 1; i < a.length; i++) {
			if (a[i - 1] < a[i]) {
				if (n < i - f1) {
					n = i - f1;
					f = f1;
					l = i;
				}
			} else {
				f1 = i;
			}
		}
        int count=0;
		for (int i = f; i <= l; i++) {
            count++;
		}
        return count;
    }
}