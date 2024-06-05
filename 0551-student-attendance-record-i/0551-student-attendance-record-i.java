class Solution {
    public boolean checkRecord(String s) {
        	int count=0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='A') {
				count++;
			}
		}
		if(s.indexOf("LLL") ==-1 && count<=1) {
            return true;
		} else {
            return false;
        }
    }
}