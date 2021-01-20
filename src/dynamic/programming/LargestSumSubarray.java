package dynamic.programming;

public class LargestSumSubarray {
	
	private int[] values;
	private int[][] dpTable;
	private int size;
	
	public LargestSumSubarray(int[] values) {
		this.values = values;
		this.size = values.length;
		this.dpTable = new int[2][this.size];
		//1 row for current max, and one for global max
	}
	
	public int solve() {
		
		for(int i=1; i<this.size; i++) {
			
			int includingPreviousSum = this.values[i]+this.dpTable[0][i-1]; 
			int notIncluding = this.values[i];
			this.dpTable[0][i] = Math.max(includingPreviousSum, notIncluding);
			
			//setting globalMax
			if(this.dpTable[0][i]>this.dpTable[1][i-1]) {
				this.dpTable[1][i] = this.dpTable[0][i];
			} else {
				this.dpTable[1][i] = this.dpTable[1][i-1];
			}
		}
		
		return this.dpTable[1][this.size-1];
	}
	
	public void showSubArray(){
		System.out.println("max sum of subarray : "+this.dpTable[1][this.size-1]);
		
		int endIndex = -1;
		int startIndex = 1;
		
		for(int i=this.size-1; i>=0; i--) {
			if(this.dpTable[1][i]==this.dpTable[0][i]) {
				if(endIndex==-1) {
					endIndex = i;
				} 
			} else if(this.dpTable[0][i]<=0 && endIndex != -1){
				startIndex = i+1;
				break;
			}
		}
		
		System.out.print("[");
		for(int i = startIndex; i<=endIndex ;i++) {
			System.out.print(this.values[i]+", ");
		}
		System.out.print("]");
	}

}
