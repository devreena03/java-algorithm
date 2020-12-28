package backtracking;

public class NQueens {
	
	private int noOfqueens;
	private int[][] chessBoard;
	
	public int getNoOfqueens() {
		return noOfqueens;
	}

	public int[][] getChessBoard() {
		return chessBoard;
	}

	NQueens(int noOfqueens){
		this.noOfqueens = noOfqueens;
		this.chessBoard = new int[noOfqueens][noOfqueens];
	}
	
	public void solve() {
		
		if(setQueens(0)) {
			print();
		}else {
			System.out.println("Solution not possible");
		}
	}

	private boolean setQueens(int colIndex) {
		
		if(colIndex==noOfqueens)
			return true;
		
		for(int i=0; i< noOfqueens; i++) {
			if(isvalidMove(i, colIndex)){
				this.chessBoard[i][colIndex] = 1;
				if(setQueens(colIndex+1)) {
					return true;
				} 
				//backtracking
				this.chessBoard[i][colIndex] = 0;
			} 		
		}
		return false;
	}

	private boolean isvalidMove(int rowIndex, int colIndex) {
		//row check
		for(int i=0; i< noOfqueens ; i++) {
			if(this.chessBoard[rowIndex][i]==1) {
				return false;
			}
		}
		//digonal check, left top corner to element place(only previous values  required)
		for(int i=rowIndex,j=colIndex; i>=0 && j>=0; i--, j--) {
			if(this.chessBoard[i][j]==1) {
				return false;
			}
		}
		
		//digonal check, left bottom corner to element place(only previous values  required)
		for(int i=rowIndex,j=colIndex; i<noOfqueens && j>=0; i++, j--) {
			if(this.chessBoard[i][j]==1) {
				return false;
			}
		}
		
		return true;
	}

	private void print() {
		for(int i=0; i<noOfqueens ; i++) {
			for(int j=0; j<noOfqueens ; j++) {
				if(this.chessBoard[i][j]==1)
				  System.out.print(" * ");
				else
				  System.out.print(" - ");
			}
			System.out.println("");
		}
		System.err.println("");
		
	}
	

}
