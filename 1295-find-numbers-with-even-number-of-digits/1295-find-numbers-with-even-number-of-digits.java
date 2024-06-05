class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (checkLen(nums[i])) {
				count++;
			}
		}
        return count;
    }
    private static boolean checkLen(int n) {
		int count = 0;
		while (n != 0) {
			count++;
			n = n / 10;
		}
		return count % 2 == 0;
	}

}