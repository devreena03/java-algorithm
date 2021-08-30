package dp.unbounded.knapsack;

public class RodCutting {
	
	public int maxProfit(int[] profit, int[] arr, int rod) {
		
		int[] dp = new int[rod+1];
		
		dp[0] = 0;
		
		for(int i=1; i<=rod;i++) {
			for(int j=i; j<=rod; j++) {
				dp[j] = Math.max(dp[j], profit[i-1] + dp[j-arr[i-1]]);
			}
		}
			
		return dp[rod];
	}

}
