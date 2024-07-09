class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int m = k;
		double res = Integer.MIN_VALUE;
		if (nums.length == 1) {
            return nums[0];
		}
		for (int i = 0; i <= nums.length - k; i++) {
			int max = 0;
			for (int j = i; j < m; j++) {
				max += nums[j];
			}
			m++;
			if (res < max) {
				res = max;
			}
		}

		res = res /k;
        return res;
    }
}