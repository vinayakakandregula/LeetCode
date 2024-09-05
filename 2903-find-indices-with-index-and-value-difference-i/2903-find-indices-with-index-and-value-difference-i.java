class Solution {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        int res[] = new int[2];
        res[0] = -1;
		res[1] = -1;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				int ab = Math.abs(i - j);
				int iab = Math.abs(nums[i] - nums[j]);
				if (ab >= indexDifference && iab >= valueDifference) {
					res[0] = j;
					res[1] = i;
				}
			}
		}
        return res;
    }
}