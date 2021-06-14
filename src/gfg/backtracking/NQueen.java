package gfg.backtracking;

import java.util.ArrayList;
import java.util.List;

//https://www.geeksforgeeks.org/n-queen-problem-backtracking-3/
//https://www.geeksforgeeks.org/printing-solutions-n-queen-problem/
//https://leetcode.com/problems/n-queens/
public class NQueen {
	
	 int[][] board;
     List<List<String>> result;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NQueen nqueen = new NQueen();
		
		nqueen.solveForAny(3);
		System.out.println("-----------------");

		//printing-all- solutions
		System.out.println(nqueen.solveNQueens(9).size());
		
	}
	
	
	private void solveForAny(int n) {
		board = new int[n][n];
		if(solveonce(0)) {
			print();
		} else {
			System.out.println("Solution not possible");
		}
		
	}

	private boolean solveonce(int col) {

		if(col>=board.length)
			return true;
		
		for(int row=0; row<board.length; row++) {
			if(isValidEntry(row, col)) {
				board[row][col] = 1;
				if(solveonce(col+1))
					 return true;
				
				board[row][col] = 0;
			} 
		}
		
		return false;
	}
	
	 public List<List<String>> solveNQueens(int n) {
	        board = new int[n][n];
	        result = new ArrayList<>();
	        
//			if(!solve(0)) {
//				return new ArrayList<>();
//			}
	        solve(0);
	        return result;
	    }
	    
	    public boolean solve(int col) {

			if(col>=board.length)
				return true;
			
			for(int row=0; row<board.length; row++) {
				if(isValidEntry(row, col)) {
					board[row][col] = 1;
					if(solve(col+1)){
	                    result.add(constructOutputList());
	                }
					board[row][col] = 0;
				} 
			}
			
			return false;
		}

		private boolean  isValidEntry(int row, int col) {
			
			 for(int i=0; i<col; i++) {
				 if(board[row][i] == 1)
					 return false;
			 }
			
			 for(int i=row-1, j=col-1; i>=0&&j>=0; i--, j--) {
				 if(board[i][j] == 1)
					 return false;
			 }
			 
			 for(int i=row+1, j=col-1; i<board.length &&j>=0; i++, j--) {
				 if(board[i][j] == 1)
					 return false;
			 }
			 
			return true;
		}

	private void print() {
	   for(int i=0; i<board.length; i++) {
		   for(int j=0; j<board.length; j++) {
				   System.out.print(" "+board[i][j]+" "); 
			   }
		   System.out.println();	
	   }
	}
	
	  private List<String> constructOutputList() {
	        List<String> res = new ArrayList<>();
	      
		   for(int i=0; i<board.length; i++) {
	           StringBuilder sb = new StringBuilder();
			   for(int j=0; j<board.length; j++) {
				   if(board[i][j] == 1) {
					   sb.append("Q"); 
				   } else {
					   sb.append(".");  
				   }		   
			   }
			  System.out.println(sb.toString());
			  res.add(sb.toString());			 
		   }
	        return res;
		}


}
