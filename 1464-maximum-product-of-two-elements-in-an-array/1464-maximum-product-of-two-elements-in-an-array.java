class Solution {
    public int maxProduct(int[] nums) {
        int sum =0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(((nums[i]-1)*(nums[j]-1))>sum){
                    sum = ((nums[i]-1)*(nums[j]-1));
                }
            }
        }
        return sum;
    }
}