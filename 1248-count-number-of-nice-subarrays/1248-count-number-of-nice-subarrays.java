class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int res = 0, count = 0;
		for (int l = 0, i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 1) {
				k--;
				count = 0;
			}
			while (k == 0) {
				count++;
				k += (nums[l++] % 2);
			}
			res += count;
		}
        return res;
    }
}