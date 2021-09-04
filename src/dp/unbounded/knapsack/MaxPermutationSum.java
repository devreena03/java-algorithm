package dp.unbounded.knapsack;

public class MaxPermutationSum {

	
	public int permutationSum(int[] nums, int target) {
        
        int[] dp = new int[target+1]; 
        dp[0] = 1;
         
        for(int i=1; i<=target; i++){
            for(int way: nums){
                if(i>=way)
                  dp[i] = dp[i] + dp[i-way];
            }           
        }
        
        return dp[target];
        
    }
}
