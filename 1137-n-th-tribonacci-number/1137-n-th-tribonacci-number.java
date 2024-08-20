class Solution {
    public int tribonacci(int n) {
        if(n ==1 ||n==2 ) {
            return 1;
        }
        int a = 0, b = 1, c = 1;
		int m = 0;
		while (n-3 >= 0) {
			m = a + b + c;
			a = b;
			b = c;
			c=m;
			n--;
		}
        return m;
    }
}