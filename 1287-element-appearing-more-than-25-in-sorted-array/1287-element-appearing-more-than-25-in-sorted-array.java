class Solution {
    public int findSpecialInteger(int[] arr) {
        int count = 0;
		int res = 0;
		for (int i = 0; i < arr.length; i++) {
			int c = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j] && i > j) {
					break;
				}
				if (arr[i] == arr[j]) {
					c++;
				}
			}
			if (c >= 1 && count < c) {
				count = c;
				res = arr[i];
			}
		}
        return res;
    }
}