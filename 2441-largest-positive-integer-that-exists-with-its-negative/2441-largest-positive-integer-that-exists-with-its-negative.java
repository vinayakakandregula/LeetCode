class Solution {
    public int findMaxK(int[] nums) {
        int res = -1;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				int n = Math.abs(nums[i]);
				if ((nums[i] + nums[j] == 0) && res < n) {
					res = n;
				}
			}
		}
        return res;
    }
}