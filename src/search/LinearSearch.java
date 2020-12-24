package search;

public class LinearSearch {
	
	int[] values;
	
	public LinearSearch(int[] values) {
		this.values = values;
	}
	
	public int find(int n) {
		
		for(int i=0; i<n; i++) {
			if(values[i] == n)
				return i;
		}
		
		return -1;
	}

}
