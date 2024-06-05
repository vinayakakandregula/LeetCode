class Solution {
    public int addDigits(int num) {
        while(num>9) {
			num = check(num);
		}
        return num;
    }
    public static int check(int num) {
		int sum =0 ;
		while(num!=0) {
			int rem = num%10;
			sum = sum+rem;
			num = num/10;
		}
		return sum;
	}

}