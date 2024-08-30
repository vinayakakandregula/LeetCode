class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for (int i = 0; i < k; i++) {
			nums = check(nums, multiplier);
		}
        return nums;
    }
    private static int[] check(int[] nums, int multiplier) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < nums.length; i++) {
			if (min > nums[i]) {
				min = nums[i];
			}
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == min) {
				nums[i] = nums[i] * multiplier;
				break;
			}
		}
		return nums;
	}
}