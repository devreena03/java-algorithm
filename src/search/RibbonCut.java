package search;

public class RibbonCut {
	
	public int maxLength(int[] arr, int k) {
		int n = arr[arr.length-1];
		int[] dp = new int[n+1];
		
		dp[0] = 0;
		
		for(int i=1; i<=n; i++) {
			for(int j=0; j<arr.length; j++) {
				  dp[i] += arr[j]/i;
			}
			System.out.print(dp[i]+", ");
		}
		System.out.println();
		
		for(int i=n; i>0; i--) {
			if(dp[i] == k) {
				return i;
			}
		}
		
		return -1;
	}

}
