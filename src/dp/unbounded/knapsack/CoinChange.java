package dp.unbounded.knapsack;

import java.util.Arrays;

public class CoinChange {
	
	//way-1 space O(n*m)
	public int noOfWays(int[] coins, int target) {
		
		int n = coins.length;
		int[][] dp = new int[n+1][target+1];
		
		for(int i=0; i<=n; i++) {
			dp[i][0] = 1;
		}
		
		for(int i=1; i<=target; i++) {
			dp[0][i] = 0;
		}

		for(int i=1; i<=n; i++) {
		    for(int j=1; j<=target; j++) {
		    	if(j>=coins[i-1])
		    	  dp[i][j] = dp[i-1][j] + dp[i][j-coins[i-1]];
		    	else
		    		dp[i][j] = dp[i-1][j];
		    }
		}
		 
		return dp[n][target];
		
	} 
	
	//way-2 space O(n)
	public int noOfWays2(int[] coins, int target) {
		
		int[] dp = new int[target+1];
		dp[0] = 1;
//		
		 // Pick all coins one by one and update the table[] values
		for(int coin: coins) {
		    for(int i=coin; i<=target; i++) {
		    	dp[i] = dp[i] + dp[i-coin];
		    }
		}
		 
		return dp[target];
		
	}
	
	//way-1 O(n) space
	public int  minCoins2(int[] coins, int target) {
		
		int maxLimit = target+1;
		
		int[] dp = new int[maxLimit];
		Arrays.fill(dp, maxLimit);
		dp[0] = 0;
		
		for (int i = 1; i <= target; i++) {
			for (int coin: coins) {
				if(coin <= i) {
					dp[i] = Math.min(dp[i], dp[i-coin]+1);
				}
			}	
			//System.out.print(dp[i]+", ");
		}
		//System.out.println();
		return dp[target]==maxLimit?-1:dp[target];
	}

	//way-2 O(n*m) space
	public int  minCoins(int[] coins, int target) {
		
		int maxLimit = target+1;	// in place of Integer.Max_Value
		int n = coins.length;
		int[][] dp = new int[n+1][target+1];
		
		for(int i=0; i<=n; i++) {
			dp[i][0] = 0;
		}
		
		for(int i=1; i<=target; i++) {
			dp[0][i] = maxLimit;
		}

		for(int i=1; i<=n; i++) {
		    for(int j=1; j<=target; j++) {
		    	if(j>=coins[i-1])
		    	  dp[i][j] =  Math.min(dp[i-1][j], 1+dp[i][j-coins[i-1]]);
		    	else
		    	  dp[i][j] = dp[i-1][j];
		    }
		}
		 
		return dp[n][target]== maxLimit?-1:dp[n][target];
	}

}
