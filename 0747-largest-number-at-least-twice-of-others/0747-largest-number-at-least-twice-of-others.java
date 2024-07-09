class Solution {
    public int dominantIndex(int[] nums) {
        int max=0;
        int res = 0;
		for (int i = 0; i < nums.length; i++) {
			if (max < nums[i]) {
				max = nums[i];
				res = i;
			}
		}
		Arrays.sort(nums);
		if((nums[nums.length-2]*2)<=max){
			return res;
		} else {
			return -1;
		}
    }
}