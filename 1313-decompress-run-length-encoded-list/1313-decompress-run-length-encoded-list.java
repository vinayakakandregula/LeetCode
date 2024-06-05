class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			int n = nums[i];
			i++;
			int m = nums[i];
			for (int j = 0; j < n; j++) {
				list.add(m);
			}

		}
		int res[] = new int[list.size()];
		int i = 0;
		for (Integer integer : list) {
			res[i++] = integer;
		}
        return res;
    }
}