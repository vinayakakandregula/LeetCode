class Solution {
    public int countDistinctIntegers(int[] score) {
        int[] s2 = new int[score.length];
		for (int i = 0, j = 0; i < score.length; i++) {
			s2[j++] = rev(score[i]);
		}
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0, j = 0; i < s2.length + score.length; i++) {
			if (i < score.length) {
				set.add(score[i]);
			} else {
				set.add(s2[j++]);
			}
		}
        return set.size();
    }
    public static int rev(int num) {
		int sum = 0;
		while (num != 0) {
			int rem = num % 10;
			sum = sum * 10 + rem;
			num /= 10;
		}
		return sum;
	}

}