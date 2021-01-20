package sort;

public class MergeSort {
	
	private int[] values;
	private int[] temp;
	
	
	public void sort(int[] values) {
		this.values = values;
		this.temp = new int[values.length];
	
		split(0, values.length-1);
		
		print();
			
	}

	private void print() {
		for(int i=0; i< values.length; i++) {
			System.out.print(values[i]+", ");
		}
	
		System.out.println();
	}

	private void split(int start, int end) {
		
		if(start>=end) 
			return;
		
		 int middle = (start + end) / 2;
		 
		 split(start, middle);
		 split(middle+1, end);
		 
		 merge(start, middle, end);
		
	}

	private void merge(int start, int middle, int end) {
		
		for(int i=0; i< values.length; i++) {
			this.temp[i] = values[i];
		}
	
		
		int i = start;
		int j = middle+1;
		int k = start;
		
		while(i<=middle && j<=end) {
			if(temp[i] <= temp[j]) {
				values[k] = temp[i];
				i++;
			} else {
				values[k] = temp[j];
				j++;
			}
			k++;
		}
		
		//copy all left array
		while(i<=middle) {	
			values[k] = temp[i];
			i++;
			k++;
		}
		
		//copy all right array
		while(j<=end) {			
			values[k] = temp[j];
			j++;
			k++;
		}
		
		
	}

}
