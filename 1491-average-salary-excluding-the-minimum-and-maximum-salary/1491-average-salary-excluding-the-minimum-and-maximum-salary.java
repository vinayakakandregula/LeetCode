class Solution {
    public double average(int[] salary) {
        double max = Integer.MIN_VALUE;
		double min = Integer.MAX_VALUE;
		for (int i = 0; i < salary.length; i++) {
			max = Math.max(max, salary[i]);
			min = Math.min(min, salary[i]);
		}
		double res = 0;
		double r= 0;
		for (int i : salary) {
			if (i != max && i != min) {
				res += i;
				r++;
			}
		}
        return res/r;
    }
}