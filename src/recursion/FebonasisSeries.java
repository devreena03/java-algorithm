package recursion;

public class FebonasisSeries {
	
	public void iterative(int n) {
		
		int[] febSer = new int[n];
		febSer[0] = 1;
		febSer[1] = 1;
		for(int i=2; i<n; i++) {
			febSer[i] = febSer[i-1] + febSer[i-2];
		}
		printSeries(febSer);	
		
	}

	private void printSeries(int[] febSer) {
		for (int i : febSer) {
			System.out.print(i+" ");
		}
		System.out.println();
	}

	public void head(int n) {
		int[] febSer = new int[n];
		head(n-1, febSer);
		printSeries(febSer);
	}

	private void head(int n, int[] febSer) {
		if(n==0 || n==1) {
			febSer[n] = 1;
			return;
		}
		head(n-1, febSer);
		head(n-2, febSer);
		
		febSer[n] = febSer[n-1] + febSer[n-2];
		
	}
}
