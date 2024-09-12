class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int removeCount = (int)(n * 0.05); 
        int sum = 0, count = 0;
        for (int i = removeCount; i < n - removeCount; i++) {
            sum += arr[i];
            count++;
        }
        double average = (double) sum / count;
        return average;
    }
}