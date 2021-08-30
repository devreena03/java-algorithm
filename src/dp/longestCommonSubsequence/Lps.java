package dp.longestCommonSubsequence;

//Longest Palindromic subSequence
public class Lps {
	
	private Lcs lcs;
	
	public Lps(String a) {
		lcs = new Lcs(a, reverse(a));
	}

	private String reverse(String a) {
		StringBuilder sb = new StringBuilder(a);
		return sb.reverse().toString();
	}
	
	public int length() {
		return lcs.length();
	}
	
	public int[][] getDp() {
		return lcs.getDp();
	}
	
	public String getSequence() {
		return lcs.getSequence();
	}

}
