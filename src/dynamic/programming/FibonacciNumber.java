package dynamic.programming;

import java.util.HashMap;
import java.util.Map;

public class FibonacciNumber {
	
	//exponential running time
	public int recursive(int n) {
		
		if(n==1) 
			return 1;
		if(n==2) 
			return 1;
		
		return recursive(n-1) + recursive(n-2);
	}
	
	//top-down approach , 0(N)
	public int memorization(int n) {
		
		Map<Integer, Integer> table = new HashMap<>();
		table.put(1, 1);
		table.put(2, 1);
		
		return febNum(n, table);
		
	}

	private int febNum(int n, Map<Integer, Integer> table) {
		
		if(!table.containsKey(n)) {
			table.put(n, febNum(n-1, table) + febNum(n-2, table));
		}
			
		return table.get(n);
	}
	
	//Bottom-up approach, O(N)
	public int tabulation(int n) {
		int[] febSeries = new int[n];
		febSeries[0] = 1;
		febSeries[1] = 1;
		
		for(int i=2; i<n; i++) {
			febSeries[i] =  febSeries[i-1] + febSeries[i-2];
		}
		
		return febSeries[n-1];
	}

}
