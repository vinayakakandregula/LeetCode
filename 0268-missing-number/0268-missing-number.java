class Solution {
    public int missingNumber(int[] nums) {
        
            sort(nums);
		int n =0;
		for (int i = 0; i < nums.length; i++) {
			if(n != nums[i]) {
                return n;
			}
			n++;
		}
        return n;
    }
    public static void sort(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			int min = i;
			for (int k = i + 1; k < nums.length; k++) {
				if (nums[k] < nums[min]) {
					min = k;
				}
			}
			int temp = nums[min];
			nums[min] = nums[i];
			nums[i] = temp;
		}

	}

}