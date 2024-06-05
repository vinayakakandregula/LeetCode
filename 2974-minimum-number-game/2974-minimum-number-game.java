class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
		int res[] = new int[nums.length];
		for (int i = 1,j=0; i < nums.length; i+=2) {
			res[j++] = nums[i];
			res[j++] = nums[i-1];
		}
        return res;
    }
}