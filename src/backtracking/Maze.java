package backtracking;

public class Maze {

	private int[][] mazeMatrix;
	private int[][] solutionMatrix;
	private int mazeSize;
	private Point startPoint;
	private Point exitPoint;
	

	public Maze(int[][] mazeMatrix) {
		this.mazeMatrix = mazeMatrix;
		this.mazeSize = mazeMatrix[0].length;
		this.solutionMatrix = new int[mazeSize][mazeSize];
		this.startPoint = new Point(0,0);
		this.exitPoint = new Point(4,4);
	}

	public Maze(int[][] mazeMatrix, Point startPoint, Point exitPoint) {
		this(mazeMatrix);
		this.startPoint = startPoint;
		this.exitPoint = exitPoint;
	}

	public void solve() {

		if (setPath(this.startPoint.getX(), this.startPoint.getY())) {
			printPath();
		} else {
			System.out.println("maze can't be solved");
		}
	}

	private boolean setPath(int row, int column) {

		if (row == this.exitPoint.getX() && column == this.exitPoint.getY()) {
			this.solutionMatrix[row][column] = 1;
			return true;
		}

		if (isValidSolve(row, column)) {

			this.solutionMatrix[row][column] = 1;

			if (setPath(row + 1, column)) {
				return true;
			}
			if (setPath(row, column+1)) {
				return true;
			}
			if (setPath(row-1, column)) {
				return true;
			}
			if (setPath(row, column-1)) {
				return true;
			}
			// backtrack
			this.solutionMatrix[row][column] = 0;
		}

		return false;
	}

	private boolean isValidSolve(int row, int column) {
		// 1 is valid move, 0 is obstacale
		if(row<0 || row>this.mazeSize-1) return false;
		if(column<0 || column>this.mazeSize-1) return false;
		
		if (mazeMatrix[row][column] == 0)
			return false;
		
		if(this.solutionMatrix[row][column] == 1)
			return false;
		
		return true;
	}

	private void printPath() {
		for (int i = 0; i < this.mazeSize; i++) {
			for (int j = 0; j < this.mazeSize; j++) {
				if (this.solutionMatrix[i][j] == 1) {
					System.out.print("* ");
				} else {
					System.out.print("- ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

}
