package dp.longestCommonSubsequence;

public class MainTest {
	

	public static void main(String[] args) {
		Lcs lcs = new Lcs("abcsed", "absgdf");
		System.out.println(lcs.length());
		System.out.println(lcs.getSequence());
		
		Lps lps = new Lps("agbcba");
		System.out.println(lps.length());
		System.out.println(lps.getSequence());
		
		Scs scs = new Scs("abcsed", "absgdf");
		
		//way1
		System.out.println(scs.findByLCS());
		System.out.println(scs.getSequenceByLcs());
		
		//way2
		System.out.println(scs.find());
		System.out.println(scs.getSequence());
		
		Scs scs2 = new Scs("abac", "cab");
		
		//way1
		System.out.println(scs2.findByLCS());
		System.out.println(scs2.getSequenceByLcs());
		
		//way2
		System.out.println(scs2.find());
		System.out.println(scs2.getSequence());
	}

}
