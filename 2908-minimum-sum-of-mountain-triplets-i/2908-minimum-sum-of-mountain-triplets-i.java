class Solution {
    public int minimumSum(int[] nums) {
        int res = Integer.MAX_VALUE;
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				for (int j2 = j + 1; j2 < nums.length; j2++) {
					if ((i < j && j < j2) && (nums[i] < nums[j] && nums[j2] < nums[j])) {
						int sum = nums[i] + nums[j] + nums[j2];
						if (sum < res) {
							res = sum;
							count++;
						}
					}
				}
			}
		}
        if(count==0){
            return -1;
        }
        return res;
    }
}