class Solution {
    public int findPeakElement(int[] nums) {
        int res = Integer.MIN_VALUE;
		int r = 0;
		for (int i = 0; i < nums.length; i++) {
			if(res<nums[i]) {
				r=i;
                res=nums[i];
			}
		}
        return r;
    }
}