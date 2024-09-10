class Solution {
    public int diagonalPrime(int[][] nums) {
        int res = 0;
        
        for(int i = 0; i < nums.length; i++) {
            int n = nums[i][i];
            if(isPrime(n)) {
                res = Math.max(res, n);  
            }
        }
        
        for(int i = 0; i < nums.length; i++) {
            int n = nums[i][nums.length - 1 - i];
            if(isPrime(n)) {
                res = Math.max(res, n); 
            }
        }
        
        return res;
    }
    
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
