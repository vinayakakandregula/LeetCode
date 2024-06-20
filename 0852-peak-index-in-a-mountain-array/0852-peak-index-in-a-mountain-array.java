class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int num = Integer.MIN_VALUE;
        int res =Integer.MIN_VALUE;
		for (int i = 0; i < arr.length - 1; i++) {
			if (res < arr[i]) {
				num = i;
                res = arr[i];
			}
		}
        return num;
    }
}