import java.math.BigInteger;

class Solution {
    public int superPow(int a, int[] b) {
        String str = "";
		for (int i = 0; i < b.length; i++) {
			str += b[i];
		}
		BigInteger e = new BigInteger(str);
		BigInteger x = BigInteger.valueOf(a);
		BigInteger  res = x.modPow(e,BigInteger.valueOf(1337));
        return res.intValue();
    }
}