class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();
		for (int i = 0; i < nums1.length; i++) {
			set1.add(nums1[i]);
		}
		for (int i = 0; i < nums2.length; i++) {
			set2.add(nums2[i]);
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (Integer integer : set1) {
			if (set2.contains(integer)) {
				list.add(integer);
			}
		}
		int res[] = new int[list.size()];
		for (int i = 0; i < res.length; i++) {
			res[i] = list.get(i);
		}
        return res;
    }
}