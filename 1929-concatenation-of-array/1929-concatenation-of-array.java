class Solution {
    public int[] getConcatenation(int[] nums) {
        int res[] = new int[nums.length + nums.length];
		for (int i = 0, j = 0; i < nums.length + nums.length; i++) {
			if (i < nums.length) {
				res[i] = nums[i];
			} else {
				res[i] = nums[j++];
			}
		}
        return res;
    }
}