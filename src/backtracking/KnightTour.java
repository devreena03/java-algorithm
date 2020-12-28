package backtracking;

public class KnightTour {

	private int[][] solutionMatrix;
	private int boardSize;
	
//	private int[] xMoves = { 2, 1, -1, -2, -2, -1, 1, 2 };
//	private int[] yMoves = { 1, 2, 2, 1, -1, -2, -2, -1 };
	
	int count_i=0;
	
	//not feasible points
//	private Point[] knightMovePoints = { new Point(2, 1), new Point(2, -1), new Point(1, 2), new Point(-1, 2), new Point(-2, 1),
//			new Point(-2, -1), new Point(1, -2), new Point(-1, -2) };
	
	private Point[] knightMovePoints = { new Point(2, 1), new Point(1, 2), new Point(-1, 2), new Point(-2, 1), new Point(-2, -1),
			new Point(-1, -2), new Point(1, -2), new Point(2, -1) };

	public KnightTour(int boardSize) {
		this.boardSize = boardSize;
		this.solutionMatrix = new int[this.boardSize][this.boardSize];
		
	}

	public void solve() {
		
		this.solutionMatrix[0][0] = 1;
		
		if (knightMove(2, 0, 0)) {
			printBoard();
		} else {
			System.out.println("solution not possible");
		}
	}

	private void printBoard() {
		System.out.println(count_i);
		
		for (int i = 0; i < this.boardSize; i++) {
			for (int j = 0; j < this.boardSize; j++) {
				System.out.print(this.solutionMatrix[i][j] + " ");
			}
			System.out.println();
		}

	}

	private boolean knightMove(int count, int row, int column) {
		
		if (count == this.boardSize * this.boardSize + 1)
			return true;

		for (int i = 0; i < knightMovePoints.length; i++) {
			int nextX = row + knightMovePoints[i].getX();
			int nextY = column + knightMovePoints[i].getY();
			
//		for (int i = 0; i < xMoves.length; i++) {
//			int nextX = row + xMoves[i];
//			int nextY = column + yMoves[i];
			count_i++;
			
			if (isvalidMove(nextX, nextY)) {
				this.solutionMatrix[nextX][nextY] = count;
				//System.out.println("X: "+nextX+" nextY:"+nextY+" count:"+count);
				if (knightMove(count+1, nextX, nextY)) {
					return true;
				}
				// backtrack
				this.solutionMatrix[nextX][nextY] = 0;
			}
		}
		return false;
	}

	private boolean isvalidMove(int row, int column) {
		if(row<0 || row>=this.boardSize) 
			return false;
		
		if(column<0 || column>=this.boardSize) 
			return false;
		
		if(this.solutionMatrix[row][column] != 0)
			return false;
		
		return true;
	}

}
