class Solution {
    public int numberOfMatches(int n) {
        int sum =0;
		while (n > 1) {
			int rem = 0;
			if (n % 2 == 0) {
				rem = n / 2;
				sum +=rem;
				n = n - rem;
			} else {
				rem = (n-1)/2+1;
				sum +=rem;
				n = n - rem;
			}
		}
        return sum;
    }
}