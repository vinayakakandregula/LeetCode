class Solution {
    public int maxRepeating(String sequence, String word) {
        int count = 0;
		String wordgreedy = word;

		while (sequence.contains(wordgreedy)) {
			wordgreedy += word; 
			count++; 
		}

        return count;
    }
}