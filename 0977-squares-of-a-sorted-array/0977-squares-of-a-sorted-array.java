class Solution {
    public int[] sortedSquares(int[] nums) {
        int res[] = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			res[i] = nums[i] * nums[i];
		}
//		Arrays.sort(res);
		for (int i = 0; i < res.length; i++) {
			int min = i;
			for (int j = i + 1; j < res.length; j++) {
				if (res[j] < res[min]) {
					min = j;
				}
			}
			int temp = res[min];
			res[min] = res[i];
			res[i] = temp;
		}
        return res;
    }
}