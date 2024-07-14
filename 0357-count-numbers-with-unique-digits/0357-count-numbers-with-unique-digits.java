class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) {
            return 1;
        }
        if (n > 10) {
            n = 10; 
        }
        
        int u = 10; 
        int a = 9;
        int c = 9;
        
        for (int i = 2; i <= n; i++) {
            c *= a;
            u += c;
            a--;
        }
        
        return u;
    }
}























// class Solution {
//     public int countNumbersWithUniqueDigits(int n) {
//       int m = (int) Math.pow(10, n);
// 		int count = 0;
// 		for (int i = 0; i < m; i++) {
// 			if (check(i)) {
// 				count++;
// 			}
// 		}
//         return count;
//     }
//     public static boolean check(int num) {
// 		List<Integer> al = new ArrayList<Integer>();
// 		while (num != 0) {
// 			int rem = num % 10;
// 			if (al.contains(rem)) {
// 				return false;
// 			}
// 			al.add(rem);
// 			num /= 10;
// 		}
// 		return true;
// 	}
// }