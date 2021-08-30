package dp.unbounded.knapsack;

public class UnboundedMain {
	private int[][] dp;
	
	public static void main(String[] args) {
		UnboundedMain obj = new UnboundedMain();
		int[] val = {6, 10, 12};
		int[] wt = {1, 2 ,3};
		System.out.println(obj.knapsack(val, wt, 6, 3));
	}
	
	public int knapsack(int[] val, int wg[], int W, int n) {
		dp = new int[n+1][W+1];
		
		for(int i=0; i<=n; i++) {
			dp[i][0] = 0;
		}
		
		for(int j=0; j<=W; j++) {
			dp[0][j] = 0;
		}
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=W; j++) {
				if((wg[i-1]<=j)) {
					dp[i][j] = Math.max(dp[i-1][j], val[i-1]+ dp[i][j-wg[i-1]]);
				} else {
					dp[i][j] = dp[i-1][j];
				}
			}
		}
		
		return dp[n][W];
	}

}
