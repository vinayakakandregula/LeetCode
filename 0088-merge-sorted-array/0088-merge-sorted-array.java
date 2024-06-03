class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
		for (int i = m, j = 0; i < nums1.length; i++) {
			nums1[i] = nums2[j++];
		}
        for (int i = 0; i < nums1.length; i++) {
			int min = i;
			for (int j = i + 1; j < nums1.length; j++) {
				if (nums1[j] < nums1[min]) {
					min = j;
				}
			}
			int temp = nums1[i];
			nums1[i] = nums1[min];
			nums1[min] = temp;
		}
    }
}