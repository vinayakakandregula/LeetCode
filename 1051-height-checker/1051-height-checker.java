class Solution {
    public int heightChecker(int[] heights) {
        int[] dp = new int[heights.length];
		for (int i = 0; i < heights.length; i++) {
			dp[i] = heights[i];
		}
		sort(heights);
		int count = 0;
		for (int i = 0; i < dp.length; i++) {
			if (dp[i] != heights[i]) {
				count++;
			}
		}
        return count;
    }
    private static void sort(int[] heights) {
		for (int i = 0; i < heights.length; i++) {
			int min = i;
			for (int j = i + 1; j < heights.length; j++) {
				if (heights[j] < heights[min]) {
					min = j;
				}
			}
			int temp = heights[i];
			heights[i] = heights[min];
			heights[min] = temp;
		}
	}
}