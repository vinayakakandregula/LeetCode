class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
       int count = 0;
		int i = 0;
		int right = colors.length - 1;
		int left = i + 1;
		int n = colors.length;
		while (n > 0) {
			if (colors[i] != colors[right] && colors[i] != colors[left]) {
				count++;
			}
			if (right == colors.length - 1) {
				right = 0;
			} else {
				right++;
			}
			if (left == colors.length - 1) {
				left = 0;
			} else {
				left++;
			}
			i++;
			n--;
		}

        return count;
    }
}