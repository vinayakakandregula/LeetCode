class Solution {
    public int hammingDistance(int x, int y) {
         int xor = x ^ y, distance = 0;

        while(xor != 0) {
            if(xor % 2 == 1)
                distance++;
            xor = xor >> 1;
        }

        return distance;
    }
}