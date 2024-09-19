class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);

		Set<Double> set = new HashSet<>();
		int left = 0;
		int right = nums.length - 1;

		while (left < right) {
			int min = nums[left];
			int max = nums[right];
			double average = (min + max) / 2.0;

			set.add(average);
			left++;
			right--;
		}
        return set.size();
    }
}