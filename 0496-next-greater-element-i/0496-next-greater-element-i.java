class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
		for (int i = 0; i < nums1.length; i++) {
			int res = nextgreaternum(nums1[i], nums2);
			result[i] = res;
		}
        return result;
    }
    public static int nextgreaternum(int i, int[] nums2) {
		int index = 0;
		for (int j = 0; j < nums2.length; j++) {
			if (i == nums2[j]) {
				index = j;
			}
		}
		for (int j = index; j < nums2.length; j++) {
			if (j + 1 <= nums2.length && nums2[index] < nums2[j]) {
				return nums2[j];
			}
		}
		return -1;

	}
}