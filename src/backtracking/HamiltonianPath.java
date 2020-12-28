package backtracking;

public class HamiltonianPath {

	private int[][] hamiltonianGraph;
	private int[] hamiltonianPath;
	private int noOfVertex;

	HamiltonianPath(int[][] hamiltonianGraph) {
		this.hamiltonianGraph = hamiltonianGraph;
		this.noOfVertex = hamiltonianGraph[0].length;
		this.hamiltonianPath = new int[noOfVertex];
	}

	public void solve() {

		this.hamiltonianPath[0] = 0;

		if (setHamiltonianPath(1)) {
			printHamiltonianPath();
		} else {
			System.out.println("solution not possible");
		}
	}

	private boolean setHamiltonianPath(int path_index) {

		if (path_index == noOfVertex) {
			return this.hamiltonianGraph[this.hamiltonianPath[0]][this.hamiltonianPath[noOfVertex - 1]] == 1;
		}

		for (int vertex = 1; vertex < noOfVertex; vertex++) {
			if (isvalidMove(path_index, vertex)) {
				this.hamiltonianPath[path_index] = vertex;
				if (setHamiltonianPath(path_index + 1)) {
					return true;
				}
				// backtrace;
			}

		}

		return false;

	}

	private boolean isvalidMove(int path_index,int vertex) {
		
				
		//whether 2 nodes are connected
		if(this.hamiltonianGraph[this.hamiltonianPath[path_index-1]][vertex]==0) {
			return false;
		}
		
		for (int i = 0; i < path_index; i++) {
			if (this.hamiltonianPath[i] == vertex) {
				return false;
			}
		}
		return true;
	}

	private void printHamiltonianPath() {
		for (int is : this.hamiltonianPath) {
			System.out.print(is + " ");
		}
		System.out.print(this.hamiltonianPath[0]);
	}

}



