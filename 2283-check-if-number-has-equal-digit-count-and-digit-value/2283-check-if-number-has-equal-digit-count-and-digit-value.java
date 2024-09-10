class Solution {
    public boolean digitCount(String num) {
        for (int i = 0; i < num.length(); i++) {
            int expectedCount = num.charAt(i) - '0';  
            int actualCount = 0;

            for (int j = 0; j < num.length(); j++) {
                if (num.charAt(j) - '0' == i) {
                    actualCount++;
                }
            }

            if (actualCount != expectedCount) {
                return false;
            }
        }

        return true;
    }
}
