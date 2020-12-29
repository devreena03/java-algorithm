package dynamic.programming;

public class Knapsack {
	
	//I/p
	private int noOfItems;
	private int capacity;
	private int[] itemWeights;
	private int[] itemValues;
	
	private int[][] knapsackTable;
	
	//O/p
	private int totalBenefit;

	
	public Knapsack(int noOfItems, int capacity, int[] itemWeights, int[] itemValues) {
		
		this.noOfItems = noOfItems;
		this.capacity = capacity;
		this.itemWeights = itemWeights;
		this.itemValues = itemValues;
		
		this.knapsackTable = new int[noOfItems+1][capacity+1];
	}
	
	public void solve() {
		
		//0 index is always value 0, so start with 1
		for(int i=1; i< this.noOfItems + 1; i++) {
			for(int w=1; w< this.capacity +1; w++) {
				
				int itemNotInclude = this.knapsackTable[i-1][w];
				int itemInclude = 0;
				
				if(this.itemWeights[i] <= w) {
					itemInclude = this.itemValues[i] + this.knapsackTable[i-1][w-this.itemWeights[i]];
				}
				
				this.knapsackTable[i][w] = Math.max(itemNotInclude, itemInclude);			}
		}
		
		this.totalBenefit = this.knapsackTable[this.noOfItems][this.capacity];
		
		
	}

	public void showResult() {
		System.out.println("total benefits :"+this.totalBenefit);
		
		for(int i=this.noOfItems, w = this.capacity; i>0; i--) {
			if(this.knapsackTable[i][w] !=0 && this.knapsackTable[i][w] != this.knapsackTable[i-1][w]) {
				System.out.println("Item used : "+i);
				w = w - this.itemWeights[i];
			}
		}
		
	}
	

}
