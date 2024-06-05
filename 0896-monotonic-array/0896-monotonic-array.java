class Solution {
    public boolean isMonotonic(int[] nums) {
        int count = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] <= nums[i + 1]) {
				count++;
			}
		}
		if (count == nums.length - 1) {
            return true;
		}
		System.out.println(count);
		int count1 = 0;
		for (int i = nums.length - 1; i > 0; i--) {
			if (nums[i] <= nums[i - 1]) {
				count1++;
			}
		}
		System.out.println(count1);
		if (count1 == nums.length - 1) {
            return true;
		} else {
            return false;
		}

    }
}