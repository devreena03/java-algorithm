package dynamic.programming;

public class SubsetSum {
	
	// I/p
	private int sum;
	private int[] integerList;

	private boolean[][] dpTable;
	
	

	public SubsetSum(int sum, int[] integerList) {
		super();
		this.sum = sum;
		this.integerList = integerList;
		this.dpTable = new boolean[integerList.length+1][sum+1];
	}

	public boolean solve() {
		
		//initialize
		for (int i = 0; i <= this.integerList.length ; i++) {
			this.dpTable[i][0] = true;
		}

		for (int i = 1; i < this.integerList.length + 1; i++) {
			for (int j = 1; j < this.sum + 1; j++) {
				
				if(this.dpTable[i - 1][j]) {
					this.dpTable[i][j]  = this.dpTable[i-1][j] ;
				} else if(j-integerList[i]>=0) {
					this.dpTable[i][j] = this.dpTable[i - 1][j-integerList[i]];
				}

			}
		}
		return this.dpTable[this.integerList.length][this.sum];
	}

	public void showResult() {
		printTable();
		System.out.println("Subset sum " + this.sum +" :"+this.dpTable[this.integerList.length][this.sum]);
		
		for (int i = this.integerList.length, j = this.sum; i > 0; i--) {
			if (this.dpTable[i][j] != this.dpTable[i - 1][j]) {
				System.out.println("value include for subset sum :" + integerList[i]);
				j = j-integerList[i];
			}
		}
	}

	private void printTable() {
		for (int i = 0; i < this.integerList.length + 1; i++) {
			for (int j = 0; j < this.sum + 1; j++) {
				System.out.print(this.dpTable[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
