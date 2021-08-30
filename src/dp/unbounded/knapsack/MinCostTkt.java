package dp.unbounded.knapsack;

public class MinCostTkt {
	public static void main(String[] args) {
		System.out.println(mincostTickets(new int[] {1,4,6,7,8,20}, 
				new int[] {7,2,15}));
	}
	 public static int mincostTickets(int[] days, int[] costs) {
	        
//	        int n =  days[days.length-1];
//	        
//	        Set<Integer> set = new HashSet<Integer>();
//	        
//	        int[] costDay = {1,7,30};
//	        
//	        int[] dp = new int[n+1];
//	        
//	        Arrays.fill(dp, Integer.MAX_VALUE);
//	        dp[0] = 0;
//	        
//	        for(int i=0; i<days.length; i++){
//	            set.add(days[i]);
//	        }
//	        
//	         for(int i=1; i<=n; i++){
//	            if(set.contains(i)){
//	                 for(int j=0; j<costs.length; j++){
//	                    
//	                       int j2 = dp[Math.max(0,i-costDay[j])];
//	                       
//	                       int k = costs[j];
//	                       
//						   dp[i] = Math.min(dp[i], j2+k);
//	                    
//	                 }
//	            } else {
//	                dp[i] = dp[i-1];
//	            }
//	             System.out.println(dp[i]+", ");
//	         }
//	        
//	        return dp[n];
		 
		  int n = days[days.length - 1];
	        boolean[] travel = new boolean[n+1];
	        int[] amount = new int[n+1];
	        for(int day : days) {
	            travel[day] = true;
	        }
	        amount[0] = 0;
	        for(int i=1; i<=n; ++i) {
	            if(travel[i]) {
	                int min = amount[i-1] + costs[0];
	                min = Math.min(min, (i < 7 ? 0 : amount[i-7]) + costs[1]);
	                min = Math.min(min, (i < 30 ? 0 : amount[i-30]) + costs[2]);
	                amount[i] = min;
	            } else {
	                amount[i] = amount[i-1];
	            }
	        }
	        return amount[n];
	        
	    }
}
