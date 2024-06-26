class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
Map<Integer, Integer> posMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			posMap.put(nums[i], i);
		}

		for (int[] operation : operations) {
			int oldVal = operation[0];
			int newVal = operation[1];
			if (posMap.containsKey(oldVal)) {
				int pos = posMap.get(oldVal);
				nums[pos] = newVal;
				posMap.remove(oldVal);
				posMap.put(newVal, pos);
			}
		}
        return nums;
    }
 
}