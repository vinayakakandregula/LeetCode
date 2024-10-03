class Solution {
    public int findFinalValue(int[] nums, int original) {
        Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			set.add(nums[i]);
		}
		while (set.contains(original)) {
			original *= 2;
		}
        return original;
    }
}