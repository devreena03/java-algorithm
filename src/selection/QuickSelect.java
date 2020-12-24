package selection;

import java.util.Random;

public class QuickSelect {
	
	int[] values;
	
	public QuickSelect(int[] values) {
		this.values = values;
	}
	
	 public void sort() {
	        for(int i=1;i<values.length+1;++i) {
	            System.out.println(selectMin(i));
	        }
	 }
	
	//should select minimum of kth element, ex: 2nd minimum
	public int selectMin(int k) {
		return select(k-1, 0, values.length-1);		
	}
	
	public int selectMax(int k) {
		//for array of 8,max of 2nd is min of 6th 
		return select(values.length-k, 0, values.length-1);		
	}

	private int select(int k,int start_index, int last_index) {
		
		int pivot_index = partition(start_index, last_index);
		
		if(pivot_index==k) 
			return values[pivot_index];
		
		if(k < pivot_index) {
			return select(k, start_index, pivot_index-1);
		}
		
		return select(k, pivot_index+1, last_index);
	}
	
	//left half is lower value than pivot and right is higher values
	private int partition(int start_index, int last_index) {
		
		//select random index and swap with last or select last index as pivot
		//between 0 (inclusive) and n (exclusive), 
		int pivot_index = new Random().nextInt(last_index-start_index+1)+start_index;
		swapElement(pivot_index,last_index); //pivot element has moved to last
		pivot_index = last_index;
		
		for(int i=start_index; i<last_index; i++) {
			if(values[i] < values[pivot_index]) { // values[i] < values[pivot_index] for min based, values[i] > values[pivot_index] for max based
				swapElement(start_index, i);
				start_index++;
			}
		}
		swapElement(start_index, pivot_index);
		return start_index;
		
	}
	
	// left half is higher value than pivot and right is lower values
	private int partitionMax(int start_index, int last_index) {
		
		//select random index and swap with last or select last index as pivot
		//between 0 (inclusive) and n (exclusive), 
		int pivot_index = new Random().nextInt(last_index-start_index+1)+start_index;
		swapElement(pivot_index,last_index); //pivot element has moved to last
		pivot_index = last_index;
		
		for(int i=start_index; i<last_index; i++) {
			if(values[i] > values[pivot_index]) { // values[i] < values[pivot_index] for min based, values[i] > values[pivot_index] for max based
				swapElement(start_index, i);
				start_index++;
			}
		}
		swapElement(start_index, pivot_index);
		return start_index;
		
	}

	private void swapElement(int a, int b) {
		int temp = values[a];
		values[a] = values[b];
		values[b] = temp;
		
	}

}
