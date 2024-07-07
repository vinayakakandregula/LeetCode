import java.math.BigInteger;

class Solution {
    public String multiply(String num1, String num2) {
         BigInteger big = new BigInteger(num1);
        BigInteger big1 = new BigInteger(num2);
        return big.multiply(big1)+"";
        
    }
}