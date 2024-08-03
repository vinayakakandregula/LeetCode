class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int minSum = Integer.MAX_VALUE;
		List<String> result = new ArrayList<String>();
		for (int i = 0; i < list1.length; i++) {
			for (int j = 0; j < list2.length; j++) {
				if (list1[i].equals(list2[j])) {
					if ((i+j) < minSum) {
                    minSum = i+j;
                    result.clear();  
                    result.add(list2[j]);
                } else if ((i+j) == minSum) {
                    result.add(list2[j]);  
                }
				}
			}
		}
	return result.toArray(new String[result.size()]);
    }
}