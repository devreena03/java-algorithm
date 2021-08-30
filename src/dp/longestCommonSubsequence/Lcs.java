package dp.longestCommonSubsequence;

//Longest Common SubSequence
public class Lcs {
	private int[][] dp;
	private String a;
	private String b;

	Lcs() {

	}

	Lcs(String a, String b) {
		this.a = a;
		this.b = b;
		evaluate(a, b);
	}

	public int length() {
		return dp[dp.length - 1][dp[0].length - 1];
	}

	public int[][] getDp() {
		return this.dp;
	}

	public String getSequence() {
		int l = length();
		char[] ch = new char[l];
		int i = a.length();
		int j = b.length();

		while (i > 0 && j > 0) {
			if (a.charAt(i - 1) == b.charAt(j - 1)) {
				ch[--l] = a.charAt(i - 1);
				i--;
				j--;
			} else if (dp[i - 1][j] > dp[i][j - 1])
				i--;
			else
				j--;
		}
		return new String(ch);

	}

	public void evaluate(String a, String b) {
		int n = a.length();
		int m = b.length();

		dp = new int[n + 1][m + 1];

		for (int i = 0; i <= n; i++) {
			dp[i][0] = 0;
		}

		for (int j = 0; j <= m; j++) {
			dp[0][j] = 0;
		}

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				if (a.charAt(i - 1) == b.charAt(j - 1)) {
					dp[i][j] = 1 + dp[i - 1][j - 1];
				} else {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
				}
			}
		}
	}
}
