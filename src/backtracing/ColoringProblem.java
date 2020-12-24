package backtracing;

import java.util.HashMap;
import java.util.Map;

public class ColoringProblem {
	int[][] adjancencyMatrix;
	int[] colors;
	int noOfNode;
	int noOfColor;
	private static Map<Integer, String> colorsLookup = new HashMap<>();

	static {
		colorsLookup.put(1, "Yellow");
		colorsLookup.put(2, "Blue");
		colorsLookup.put(3, "Red");
		colorsLookup.put(4, "Green");
		colorsLookup.put(5, "Black");
		
	}
	
	ColoringProblem(int[][] adjancencyMatrix, int noOfColor) {
		this.adjancencyMatrix = adjancencyMatrix;
		this.noOfColor = noOfColor;
		this.noOfNode = adjancencyMatrix[0].length;
		this.colors = new int[noOfNode];
	}

	public void solve() {

		colors[0] = 1;

		if (setColor(1)) {
			printColorApplied();
		} else {
			System.out.println("coloring with given number of color is not possible");
		}
	}

	private boolean setColor(int node_index) {
		if(node_index == noOfNode) {
			return true;
		}
		
		for(int color=1; color<= noOfColor;color++) {
			
			if(isValidColor(node_index,color)) {
				colors[node_index] = color;
				
				if(setColor(node_index+1))
				   return true;
			}
		}
		
		return false;
	}

	private boolean isValidColor(int node_index, int color) {
		for(int row=0; row<noOfNode; row++) {
			if(adjancencyMatrix[row][node_index]==1 && colors[row]==color) 
				  return false;
			}
		
		return true;
	}

	private void printColorApplied() {
		
		for(int i=0;i<noOfNode;i++) {
			System.out.println("Node :" + i+ " has color: "+colorsLookup.get(colors[i]));
		}
		
	}
}
