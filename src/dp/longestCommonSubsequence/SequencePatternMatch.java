package dp.longestCommonSubsequence;

public class SequencePatternMatch {

	public static void main(String[] args) {
		SequencePatternMatch m = new SequencePatternMatch();
		
		System.out.println(m.isMatch("absgdcf","abcd"));
		System.out.println(m.isMatch("absgdcf","abc"));
	}
	
	public boolean isMatch(String a, String b) {
		Lcs lcs = new Lcs(a, b);
		return b.length()==lcs.length();
	}
}
