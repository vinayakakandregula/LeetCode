class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
    if(Integer.parseInt(sum(targetWord))==(Integer.parseInt(sum(secondWord))+Integer.parseInt(sum(firstWord)))){
        return true;		
    } else {
         return false;
		}
    }
    public static String sum(String firstWord) {
		char ch[] = firstWord.toCharArray();
		String str = "";
		for (int i = 0; i < ch.length; i++) {
			int sum =(ch[i]-97);
			str +=sum;
		}
		return str;
	}
}