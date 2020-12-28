package backtracking;

public class Sudoku {
	private int[][] sudokuMatrix;
	private int boardSize;
	private int boxSize;

	public Sudoku(int[][] sudokuMatrix, int boxSize) {
		this.boxSize = boxSize;
		this.boardSize = boxSize*boxSize;
		this.sudokuMatrix = sudokuMatrix;

	}

	public void solve() {
		if (move(0, 0)) {
			printBoard();
		} else {
			System.out.println("solution not possible");
		}
	}

	private boolean move(int row, int column) {
		if (row == this.boardSize) {
			// end of row, move to next column
			column++;
			row = 0;
			if (column == this.boardSize) {
				return true; // end of all iteration
			}
		}

		if (this.sudokuMatrix[row][column] != 0) 
			return move(row+1, column);
		
		for (int num = 1; num <= 9; num++) {
			if (isValidEntry(num, row, column)) {
				this.sudokuMatrix[row][column] = num;
				if (move(row + 1, column)) {
					return true;
				}
				this.sudokuMatrix[row][column] = 0;
			}
		}
		

		return false;
	}

	private boolean isValidEntry(int num, int row, int column) {
		//valid in row
		for(int i=0;i<this.boardSize; i++) {
			if(this.sudokuMatrix[row][i]==num)
				return false;
		}
		//valid in column
		for(int i=0;i<this.boardSize; i++) {
			if(this.sudokuMatrix[i][column]==num)
				return false;
		}
		//valid in box
		int rowStartIndex = row - row % boxSize;
		int colStartIndex = column - column % boxSize;
		for(int i=rowStartIndex; i<rowStartIndex+boxSize; i++) {
			for(int j=colStartIndex; j<colStartIndex+boxSize; j++) {
				if(this.sudokuMatrix[i][j]==num)
					return false;
			}
		}
		return true;
	}

	private void printBoard() {
		for (int i = 0; i < this.boardSize; i++) {
			for (int j = 0; j < this.boardSize; j++) {
				System.out.print(this.sudokuMatrix[i][j] + " ");
			}
			System.out.println();
		}

	}
}
