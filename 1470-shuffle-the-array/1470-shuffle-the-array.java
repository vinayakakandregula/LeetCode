class Solution {
    public int[] shuffle(int[] nums, int n) {
        int res[] = new int[nums.length];
		for (int i = 0,j=0; i < n; i++) {
			res[j++] = nums[i];
			res[j++] = nums[i+n];
		}
        return res;
    }
}