class Solution {
    public int reachNumber(int target) {
        int n =0,count=0;
        target = Math.abs(target);
        while(count<target || (count-target)%2 !=0){
            n++;
            count +=n;
        }
        return n;
    }
}