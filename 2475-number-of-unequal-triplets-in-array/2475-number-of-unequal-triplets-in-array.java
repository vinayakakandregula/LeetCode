class Solution {
    public int unequalTriplets(int[] nums) {
       int count = 0;
		for (int i = 0; i < nums.length-2; i++) {
			for (int j = i+1; j < nums.length-1; j++) {
				for (int j2 = i+2; j2 < nums.length; j2++) {
					if(i<j && j<j2){
                        if ((nums[i] != nums[j]) && (nums[j] != nums[j2]) && (nums[i] != nums[j2])) {
						    count++;
					    }
                    }
				}
			}
		}
        return count; 
    }
}