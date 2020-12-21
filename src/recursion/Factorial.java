package recursion;

public class Factorial {
	
	public long head(int n) {
		if(n==1) 
			return 1;
		return n*head(n-1);
	}

	public long tail(int n) {
		long result = 1;
		return tail(n, result);
	}

	private long tail(int n, long result) {
		if(n==1) 
			return result;
		result = n*result;
		return tail(n-1, result);
		
	}

}
