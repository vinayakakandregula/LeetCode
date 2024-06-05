class Solution {
    public boolean isValid(String word) {
        String vowels = "AEOIUaeiou";
		if(word.length()<=2) {
			return false;
		}
		int count =0,vowel=0,con=0;
		for (int i = 0; i < word.length(); i++) {
			if((word.charAt(i)>='a' && word.charAt(i)<='z')||(word.charAt(i)>='A' && word.charAt(i)<='Z')|| (word.charAt(i)>='0' && word.charAt(i)<='9')) {
				count++;
			}
		}
		for (int i = 0; i < word.length(); i++) {
			if(vowels.indexOf(word.charAt(i)) !=-1) {
				vowel++;
			} else if (!(word.charAt(i)>='0' && word.charAt(i)<='9')) {
				con++;
			}
		}
        return count==word.length() && vowel >0 && con>0;
    }
}