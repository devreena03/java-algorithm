package backtracing;

public class BackTrackingTest {

	public static void main(String[] args) {
//		NQueens nq = new NQueens(5);
//		nq.solve();
		
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
		//hamiltonian.solve();
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
      // hamiltonian1.solve();
       
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
}
