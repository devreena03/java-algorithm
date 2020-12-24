package search;

public class BinarySearch {

	
    int[] values;
	
	public BinarySearch(int[] values) {
		this.values = values;
	}
	
	public int find(int n) {	
		return find(n, 0, values.length-1);		
	}
	
	public int find(int n, boolean desc) {
		
		return desc ? findDesc(n, 0, values.length-1):find(n); 		
		
	}

	private int findDesc(int n, int start, int end) {
		if(end<start)
			return -1;
		
		int mid = (start+end)/2;
		System.out.println("start: "+start +" end: "+ end +" mid: "+mid);
		
		if(values[mid] == n) {
			return mid;
		}
		 if(values[mid] < n) {
			return find(n, start, mid-1);
		}
		if (values[mid] > n){
			return find(n, mid+1, end);
		}
		return -1;
	}

	private int find(int n, int start, int end) {
		if(end<start)
			return -1;
		
		int mid = (start+end)/2;
		System.out.println("start: "+start +" end: "+ end +" mid: "+mid);
		
		if(values[mid] == n) {
			return mid;
		}
		 if(values[mid] > n) {
			return find(n, start, mid-1);
		}
		if (values[mid] < n){
			return find(n, mid+1, end);
		}
		return -1;
	}

}
