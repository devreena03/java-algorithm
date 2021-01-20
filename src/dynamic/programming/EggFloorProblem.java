package dynamic.programming;

public class EggFloorProblem {
	
	private static int floor=10;
	private static int egg = 2;
	
	private int[][] dpTable;
	
	public EggFloorProblem() {
		this.dpTable = new int[egg+1][floor+1];
	}
	
	public int solve() {
		
		int res = 0;
		
		// We need one trial for one floor and 
        // 0 trials for 0 floors 
        for (int i = 1; i <= egg; i++) { 
        	dpTable[i][1] = 1; 
        	dpTable[i][0] = 0; 
        } 
  
        // We always need j trials for one egg 
        // and j floors. 
        for (int j = 1; j <= floor; j++) 
        	dpTable[1][j] = j; 
  
        // Fill rest of the entries in table using 
        // optimal substructure property 
        for (int i = 2; i <= egg; i++) { 
            for (int j = 2; j <= floor; j++) { 
            	dpTable[i][j] = Integer.MAX_VALUE; 
                 for (int x = 1; x <= j; x++) { 
                     int eggBroke = dpTable[i - 1][x - 1];
					 int eggNotBroke = dpTable[i][j - x];
					res = 1 + Math.max(eggBroke, eggNotBroke); 
                     if (res < dpTable[i][j]) 
                    	 dpTable[i][j] = res; 
                 } 
            }
        }
        
        return dpTable[egg][floor];
	}

}
