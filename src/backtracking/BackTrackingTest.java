package backtracking;

public class BackTrackingTest {

	public static void main(String[] args) {
		
//		nQueensTest();
//		hamiltonianPathTest();
//		coloringProblemTest(); 
//		mazeTest();
//		knightTourTest();
		sudokuTest();
 
	}

	private static void sudokuTest() {
		int sudokuTable[][] = {
				{3, 0, 6, 5, 0, 8, 4, 0, 0},
        		{5, 2, 0, 0, 0, 0, 0, 0, 0},
        		{0, 8, 7, 0, 0, 0, 0, 3, 1},
        		{0, 0, 3, 0, 1, 0, 0, 8, 0},
        		{9, 0, 0, 8, 6, 3, 0, 0, 5},
        		{0, 5, 0, 0, 9, 0, 6, 0, 0},
        		{1, 3, 0, 0, 0, 0, 2, 5, 0},
        		{0, 0, 0, 0, 0, 0, 0, 7, 4},
        		{0, 0, 5, 2, 0, 6, 3, 0, 0}};
		
		Sudoku s = new Sudoku(sudokuTable, 3);
		s.solve();
		
	}

	private static void knightTourTest() {
		KnightTour kt = new KnightTour(8);
		kt.solve();
		
	}

	private static void mazeTest() {
		// TODO Auto-generated method stub
		int mazeMatrix[][] = {
				{1, 1, 1, 1, 1},
		        {0, 0, 1, 1, 1},
				{1, 1, 1, 0, 0},
				{0, 1, 0, 0, 1},
				{1, 1, 1, 1, 1}
		};
		
		Maze maze = new Maze(mazeMatrix);
		maze.solve();
		
		Point startPoint = new Point(2,0);
		Point exitPoint = new Point(4,4);
		Point exitPoint2 = new Point(0,4);
		
		Maze maze1 = new Maze(mazeMatrix, startPoint, exitPoint);
		maze1.solve();
		
		
		Maze maze2 = new Maze(mazeMatrix, startPoint, exitPoint2);
		maze2.solve();
	}

	private static void coloringProblemTest() {
		  /**
	       (0)-------(1)
	        |		   |
	        |   (4)    |  
	        |  /   \   |
	        | /	    \  |
	       (3)-------(2)    */
			
			
			int adjacencyMatrix_c[][] = {{0, 1, 0,1,0},
					  {1, 0, 1,0,0},
					  {0, 1, 0,1,1},
					  {1,0,1,0,1},
					  {0,0,1,1,0}
			};
			
			
			ColoringProblem c = new ColoringProblem(adjacencyMatrix_c,3);
	        c.solve();
		
	}

	private static void hamiltonianPathTest() {
		 /**
        (0)
         |      	  
         |   	  
         | 	      
        (1)-------(2)    */

		int adjacencyMatrix[][] = {{0, 1, 0},
				  {1, 0, 1},
				  {0, 1, 0}
		};
		HamiltonianPath hamiltonian = new HamiltonianPath(adjacencyMatrix);
		hamiltonian.solve();
		 /**
        (0)-------(1)
         |		   |
         |   (4)   |  
         |  /   \  |
         | /	 \ |
        (3)-------(2)    */
		
		
		int adjacencyMatrix1[][] = {{0, 1, 0,1,0},
				  {1, 0, 1,0,0},
				  {0, 1, 0,1,1},
				  {1,0,1,0,1},
				  {0,0,1,1,0}
		};
		
		
		HamiltonianPath hamiltonian1 = new HamiltonianPath(adjacencyMatrix1);
        hamiltonian1.solve();
		
	}

	private static void nQueensTest() {
		NQueens nq = new NQueens(5);
		nq.solve();
		
	}
}
