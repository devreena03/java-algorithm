package dynamic.programming;

public class LongestSubstring {

	public static void main(String[] args) {
		LongestSubstring ls = new LongestSubstring();
		System.out.println(ls.longestPalindrome("anaabnnb"));

	}
	
	public String longestPalindrome(String s) {
	    return expand(s);
	   // return dp(s);
	}

	private String expand(String s) {
		
	    int start = 0, end = 0;
	    for (int i = 0; i < s.length(); i++) {
	        int len1 = expandAroundCenter(s, i, i);
	        int len2 = expandAroundCenter(s, i, i + 1);
	        int len = Math.max(len1, len2);
	        if (len > end - start) {
	            start = i - (len - 1) / 2;
	            end = i + len / 2;
	        }
	    }
	    return s.substring(start, end + 1);
	}

	private int expandAroundCenter(String s, int left, int right) {
	    int L = left, R = right;
	    while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
	        L--;
	        R++;
	    }
	    return R - L - 1;
	}

	private String dp(String s) {
		int[][] dpTable = new int[s.length()][s.length()];
		
		int maxlen = 1;
		for(int i=0; i<s.length();i++) {
			dpTable[i][i] = 1; //1 char is palindgrome
			if(i+1<s.length() && s.charAt(i)==s.charAt(i+1)) {
				dpTable[i][i+1] = 1; //2 char is palindgrome if both char are equal
				maxlen =2;
			}			
		}
		printDpTable(dpTable);
		
		int j=0;
		//sp(i,j)-> s[i]==s[j] && sp(i+1, j-1), applied for ln>=3
		for(int len=2; len<s.length(); len++) { 
			for(int i=0; i<s.length()-len; i++) {
				j=i+len;
				if(s.charAt(i)==s.charAt(j) && dpTable[i+1][j-1]==1) {
					dpTable[i][j]=1;
					maxlen = len+1;
				}
			}
			
		}
		printDpTable(dpTable);
		System.out.println(maxlen);
		
		for(int i=0; i<dpTable.length-(maxlen-1);i++) {
			if(dpTable[i][i+maxlen-1]==1) {
				return s.substring(i, i+maxlen);
			}
		}
		
		return s.substring(0,1);
	}

	private void printDpTable(int[][] dpTable) {
		for(int i=0; i<dpTable.length;i++) {
			for(int j=0; j<dpTable.length;j++) {
				System.out.print(dpTable[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

}
