package dp.knapsack;

public class SubsetSum {
	private boolean[][] dp;
	
	public static void main(String[] args) {
		SubsetSum obj = new SubsetSum();
		int[] a = {3, 34, 4, 12, 5, 2};
		int sum = 26;
		System.out.println(obj.evaluate(a, sum));
	}
	
	public boolean evaluate(int[] arr, int sum) {
		int n = arr.length;
		
		dp = new boolean[n+1][sum+1];
		
		for(int i=0; i<=n; i++) {
			dp[i][0] = true;
		}
		
		for(int j=1; j<=sum; j++) {
			dp[0][j] = false;
		}
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=sum; j++) {
				if(arr[i-1]<=j){
					dp[i][j] = dp[i-1][j] || dp[i-1][j-arr[i-1]];
				} else {
					dp[i][j] = dp[i-1][j];
				}
			}
		}
		
		return dp[n][sum];
	}
}
