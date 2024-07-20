class Solution {
    public String convertToBase7(int num) {
        if(num ==0){
            return "0";
        }
        String str = "";
		int temp = num;
		num = Math.abs(num);
		while (num != 0) {
			str += num % 7;
			num /= 7;
		}
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append(str);
        if(temp<0){
            String s = "-";
            return s+stringBuffer.reverse();
        } else{
            String s = "";
            return s+stringBuffer.reverse();
        }
    }
}