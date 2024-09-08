class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			int value = smallerInArray(nums[i], nums);
			res[i] = value;
		}
        return res;
    }
    
    private static int smallerInArray(int i, int[] nums) {
		int count =0;
		for (int j = 0; j < nums.length; j++) {
			if(i>nums[j]) {
				count++;
			}
		}
		return count;
	}
}