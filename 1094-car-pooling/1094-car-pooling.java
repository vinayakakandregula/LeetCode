class Solution {
    public boolean carPooling(int[][] a, int capacity) {
        int n = a.length;
		int ar[] = new int[1001];
		int max = -1;
		int i = 0, j = 0;
		while (i < n) {
			int pass = a[i][0];
			int from = a[i][1];
			int to = a[i][2];
			ar[from] += pass;
			ar[to] -= pass;
			max = Math.max(max, to);
			i++;
		}
		int sum = 0;
		while (j <= max) {
			sum += ar[j];
			if (sum > capacity)
                return false;
			j++;
		}
        return true;
    }
}