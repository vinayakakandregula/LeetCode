class Solution {
    public int maximizeSum(int[] nums, int k) {
int max = 0, sum = 0;
		for (int i : nums) {
			max = Math.max(i, max);
		}
		for (int i = 0; i < k; i++) {
			sum += max++;
		}
        return sum;
    }
}