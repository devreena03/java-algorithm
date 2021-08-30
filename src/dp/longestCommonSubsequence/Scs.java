package dp.longestCommonSubsequence;

//Shortest Common SuperSequence
public class Scs {
	
	//way1 with lcs
	private Lcs lcs;
	private String a;
	private String b;
	private int[][] dp;
	
	public Scs(String a, String b) {
		this.a = a;
		this.b = b;
	}
	
	public int findByLCS() {
		lcs = new Lcs(a, b);
		return a.length()+b.length() - lcs.length();
	}
	
	public String getSequenceByLcs() {
		int l = a.length()+b.length() - lcs.length();
		char[] ch = new char[l];
		int i = a.length();
		int j = b.length();
		int[][] dp = lcs.getDp();

		while (i > 0 && j > 0) {
			if (a.charAt(i - 1) == b.charAt(j - 1)) {
				ch[--l] = a.charAt(i - 1);
				i--;
				j--;
			} else if (dp[i - 1][j] > dp[i][j - 1]) {
				ch[--l] = a.charAt(i - 1);
				i--;
			} else {
				ch[--l] = b.charAt(j - 1);
				j--;
			}
		}
		
		while(i>0) {
			ch[--l] = a.charAt(i - 1);
			i--;
		}
		while(j>0) {
			ch[--l] = b.charAt(j - 1);
			j--;
		}
		return new String(ch);

	}
	
	//way-2 direct scs calculation like lcs
	public int find() {
		int n = a.length();
		int m = b.length();

		dp = new int[n + 1][m + 1];

		for (int i = 0; i <= n; i++) {
			dp[i][0] = i;
		}

		for (int j = 0; j <= m; j++) {
			dp[0][j] = j;
		}

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				if (a.charAt(i - 1) == b.charAt(j - 1)) {
					dp[i][j] = 1 + dp[i - 1][j - 1];
				} else {
					dp[i][j] = 1 + Math.min(dp[i - 1][j], dp[i][j - 1]);
				}
			}
		}
		
		return dp[n][m];
	}
	
	public String getSequence() {
		
		int i = a.length();
		int j = b.length();
		int l = dp[i][j];
		char[] ch = new char[l];

		while (i > 0 && j > 0) {
			if (a.charAt(i - 1) == b.charAt(j - 1)) {
				ch[--l] = a.charAt(i - 1);
				i--;
				j--;
			} else if (dp[i - 1][j] < dp[i][j - 1]) {
				ch[--l] = a.charAt(i - 1);
				i--;
			} else {
				ch[--l] = b.charAt(j - 1);
				j--;
			}
		}
		while(i>0) {
			ch[--l] = a.charAt(i - 1);
			i--;
		}
		while(j>0) {
			ch[--l] = b.charAt(j - 1);
			j--;
		}
		return new String(ch);

	}

	

}
