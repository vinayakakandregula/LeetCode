class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int c[] = new int[A.length];
		for (int i = 0,j=0; i < c.length; i++) {
			c[j++] = check(A, B, i);
		}
        return c;
    }
    public static int check(int[] a, int[] b, int i) {
		int count = 0;
		for (int j = 0; j <= i; j++) {
			for (int j2 = 0; j2 <= i; j2++) {
				if (a[j] == b[j2]) {
					count++;
				}
			}

		}
		return count;
	}

}