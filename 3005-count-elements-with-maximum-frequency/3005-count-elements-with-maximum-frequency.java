class Solution {
    public int maxFrequencyElements(int[] nums) {
       int res[] = new int[101];
		for (int i = 0; i < nums.length; i++) {
			res[nums[i]]++;
		}
		int max = 0;
		for (int i = 0; i < res.length; i++) {
			max = Math.max(max, res[i]);
		}
		int count = 0;
		for (int i = 0; i < res.length; i++) {
			if (res[i] == max) {
				count++;
			}
		}
        return count*max;
    }
}