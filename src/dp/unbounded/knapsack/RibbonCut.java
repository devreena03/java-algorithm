package dp.unbounded.knapsack;

public class RibbonCut {
	
	public int maxLength(int[] arr, int n) {
		int m = arr.length;
		int[][] dp = new int[m+1][n+1];
		
		  for(int i=1; i<=m; i++) { 
			  for(int j=1; j<=n; j++)
				if(arr[i-1] <= j) {
				   dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-arr[i-1]]+1);
				}
			}
	
		return dp[m][n];
	}

}
