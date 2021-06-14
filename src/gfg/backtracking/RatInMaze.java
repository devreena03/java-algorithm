package gfg.backtracking;

//https://www.geeksforgeeks.org/rat-in-a-maze-backtracking-2/
public class RatInMaze {
	
	static int[][] output;
	
	public static void main(String[] args) {
		int[][] maze = {
				{1, 0, 0, 0},
				{1, 1, 0, 1},
				{0, 1, 1, 1},
				{1, 1, 0, 1}};
		
		output = new int[4][4];
		
		if(solve(0,0,maze)) {
			print();
		}else {
			System.out.println("Solution not possible");
		}
		
	}

	private static boolean solve(int row, int col, int[][] maze) {
		if(row==maze.length-1 && col==maze.length-1) {
			output[row][col] = 1;
			return true;
		}
		
		if(row==maze.length) return false;
		
		if(col==maze.length) return false;
		
		if(maze[row][col]==1) {
			output[row][col] = 1;
			if(solve(row+1,col,maze)) {
				return true;
			}
			if(solve(row, col+1, maze)){
				return true;
			}
			output[row][col] = 0;
		}
		
		return false;
	}
	

	private static void print() {
		for(int i=0; i<output.length; i++) {
			   for(int j=0; j<output.length; j++) {
					   System.out.print(" "+output[i][j]+" "); 
				   }
			   System.out.println();	
		   }
		
	}

}
