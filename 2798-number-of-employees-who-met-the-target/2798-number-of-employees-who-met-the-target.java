class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] nums, int k) {
        int count = 0;
		for (int i : nums) {
			if (i >= k) {
				count++;
			}
		}
        return count;

    }
}