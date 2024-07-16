class Solution {
    public boolean isSubsequence(String s, String t) {
        int res =0;
        int sl = s.length();
		if(s.length() > t.length()) {
			return false;
		} else if( s.length()==0){
            return true;
        }
		for (int i = 0,j=0; i < t.length(); i++) {
			if( sl!=0 && s.charAt(j)==t.charAt(i)) {
				res++;
				j++;
                sl--;
			}
		}
        return res == s.length();
    }
}