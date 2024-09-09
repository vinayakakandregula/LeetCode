class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        for(int i=0;i<heights.length;i++){
            int min =i;
            for(int j=i+1;j<heights.length;j++){
                if(heights[j]>heights[min]){
                    min = j;
                }
            }
            int tempHeight = heights[i];
			heights[i] = heights[min];
			heights[min] = tempHeight;

            String temp = names[i];
            names[i] = names[min];
            names[min] = temp;
        }
        return names;
    }
}