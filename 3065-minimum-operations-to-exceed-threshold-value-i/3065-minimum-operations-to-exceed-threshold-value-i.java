class Solution {
    public int minOperations(int[] nums, int k) {
        int count = 0;
		for (int i : nums) {
			if (i < k) {
				count++;
			}
		}
        return count;
    }
}