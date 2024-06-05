class Solution {
    public boolean squareIsWhite(String coordinates) {
        char ch = coordinates.charAt(0);
		char c = coordinates.charAt(1);
		if (ch % 2 == 0 && c % 2 == 0) {
            return false;
		} else if (ch % 2 == 1 && c % 2 == 1) {
			 return false;
		} else if (ch % 2 == 0 && c % 2 == 1) {
            return true;		
        } else if (ch % 2 == 1 && c % 2 == 0) {
			 return true;
		}
        return true;
    }
}