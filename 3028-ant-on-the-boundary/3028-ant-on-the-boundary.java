class Solution {
    public int returnToBoundaryCount(int[] nums) {
       int c = 0;
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			c += nums[i];
			if (c == 0) {
				count++;
			}
		}
        return count;
    }
}