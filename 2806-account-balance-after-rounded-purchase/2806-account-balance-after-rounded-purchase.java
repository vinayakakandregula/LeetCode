class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
		if (purchaseAmount % 10==0) {
			return 100-purchaseAmount;
		} 
        int res =100-purchaseAmount;
		 return purchaseAmount%10 >= 5 ? (res/10)*10 : ((res/10)+1)*10;
		
    }
}