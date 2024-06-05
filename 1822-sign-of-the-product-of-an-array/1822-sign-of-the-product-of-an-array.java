class Solution {
    public int arraySign(int[] nums) {
		double prod = prod(nums);
		if(prod>0) {
			return 1;
		} else if(prod<0) {
			return -1;
		} else {
			return 0;
		}
    }
    public static double prod(int[] nums) {
		double prod = 1;
		for (int i = 0; i < nums.length; i++) {
			prod = prod * nums[i];
		}
		return prod;
	}

}