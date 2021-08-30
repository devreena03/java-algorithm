package dp.minmaxpath;

public class ClimbStairs {
	
	//Way 1 - normal resursion - O(2^n)
	  public int minCostClimbingStairs1(int[] arr) {
	        int n = arr.length;
	        return Math.min(minCost(arr, n-1), minCost(arr, n-2));  
	    }
	  
	  public int minCost(int[] arr,int n){
	     if(n<2)
	         return arr[n];
	     
	      return arr[n] + Math.min(minCost(arr, n-1), minCost(arr, n-2));
	  }
	  
	  //Way-2 Top-down - recursion with memoization -O(n)
	  int[] dp;
	  public int minCostClimbingStairs2(int[] arr) {
	        int n = arr.length;
	        dp = new int[n];
	        return Math.min(minCost(arr, n-1, dp), minCost(arr, n-2, dp));
	        
	    }
	    
	    public int minCost(int[] arr,int i, int[] dp){
	        if(i<2){
	            dp[i] = arr[i];
	            return dp[i];
	        }
	        if(dp[i]!=0)
	            return dp[i];
	        
	        
	        dp[i] = arr[i] + Math.min(minCost(arr, i-1, dp), minCost(arr, i-2, dp));
	        return dp[i];
	    }
	    //Way-3 Bottom-down tabulization Time-O(n) , space O(n)
	    
	    public int minCostClimbingStairs3(int[] arr) {
	    	 int n = arr.length;
	         dp = new int[n];
	         
	         for(int i=0; i<n; i++){
	             if(i<2){
	                 dp[i] = arr[i];
	             } else {
	                 dp[i] = arr[i] + Math.min(dp[i-1], dp[i-2]);
	             }
	         }
	         return Math.min(dp[n-1], dp[n-2]);
	        
	    }
	    
	    //Way-4 enhancement in way-2 space O(1)
	    
	}


