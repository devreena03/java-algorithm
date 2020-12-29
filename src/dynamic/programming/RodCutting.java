package dynamic.programming;

public class RodCutting {

		//I/p
		private int rodLength;
		private int[] rodPrices;
		
		private int[][] dpTable;
		
		//O/p
		private int maxprofit;
		
		public RodCutting(int rodLength, int[] rodPrices) {
			this.rodLength = rodLength;
			this.rodPrices = rodPrices;
			this.dpTable = new int[rodLength+1][rodLength+1];
		}
		
		public void solve() {
			
			for(int i=1; i< this.rodLength+1 ; i++) {
				for( int j=1; j< this.rodLength+1 ; j++) {
					
					int notIncluded = this.dpTable[i-1][j];
					int included = 0;
					
					if(i<=j) { //piece is less than length of rod
						included = this.rodPrices[i] + this.dpTable[i][j-i];
					}
					this.dpTable[i][j] = Math.max(notIncluded, included);
					
				}
			}
			this.maxprofit = this.dpTable[rodLength][rodLength];
		}
		
		public void showResult() {
			printTable();
			System.out.println("Max profit :"+this.maxprofit);
			for(int i=rodLength, j=rodLength; i>0; i--) {
				if(this.dpTable[i][j] != this.dpTable[i-1][j]) {
					System.out.println("rod length :"+i);
					j = j-i;
					i++;
				}
			}
		}

		private void printTable() {
			for(int i=0; i< this.rodLength+1 ; i++) {
				for( int j=0; j< this.rodLength+1 ; j++) {
					System.out.print(this.dpTable[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
}
