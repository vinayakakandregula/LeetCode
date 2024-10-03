class Solution {
    public List<Integer> intersection(int[][] nums) {
        int res[] = new int[1001];
		List<Integer> list = new ArrayList<Integer>();
		for (int[] arr : nums) {
			for (int i : arr) {
				res[i]++;
			}
		}
		for (int i = 0; i < res.length; i++) {
			if (res[i] == nums.length) {
				list.add(i);
			}
		}

        return list;
    }
}