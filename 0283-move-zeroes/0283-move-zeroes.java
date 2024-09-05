class Solution {
    public void moveZeroes(int[] nums) {
        List<Integer> zeroes = new ArrayList<Integer>();
		List<Integer> nonZeroes = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				zeroes.add(nums[i]);
			} else {
				nonZeroes.add(nums[i]);
			}
		}
		int n = 0;
		for (int i = 0; i < nums.length; i++) {
			if (i < nonZeroes.size()) {
				nums[i] = nonZeroes.get(i);
			} else {
				nums[i] = zeroes.get(n++);
			}
		}
    }
}