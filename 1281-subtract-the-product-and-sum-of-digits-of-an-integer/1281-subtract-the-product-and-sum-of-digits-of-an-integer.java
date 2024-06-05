class Solution {
    public int subtractProductAndSum(int n) {
        return prod(n)-sum(n);
    }
    private static int sum(int n) {
		int sum = 0;
		while (n != 0) {
			int rem = n % 10;
			sum = sum + rem;
			n = n / 10;
		}
		return sum;

	}

	private static int prod(int n) {
		int prod = 1;
		while (n != 0) {
			int rem = n % 10;
			prod = prod * rem;
			n = n / 10;
		}
		return prod;
	}

}