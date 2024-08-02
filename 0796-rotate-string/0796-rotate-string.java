class Solution {
    public boolean rotateString(String s, String goal) {
        int n = 0;
		while (n != s.length()) {
			if(s.equals(goal)) {
                return true;
			}
			s = s.substring(1)+s.substring(0,1);
			n++;
		}
        return false;
    }
}