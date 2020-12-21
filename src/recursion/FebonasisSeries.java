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
			System.out.println(i);
		}
	}

	public int tail(int n) {
		return tail(n, 0, 1);
	}

	private int tail(int n, int a, int b) {
		if(n==0)
			return a;
		if(n==1)
			return b;
		System.out.println(n);
		return tail(n-1, b, a+b);
	}
}
