class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
		Set<Integer> set1 = new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (!set.contains(nums[i])) {
				set.add(nums[i]);
			} else {
				if (!set1.contains(nums[i])) {
					set1.add(nums[i]);
				} else {
					return false;
				}
			}
		}
		return true;
    }
}