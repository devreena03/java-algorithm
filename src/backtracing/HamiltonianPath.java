package backtracing;

public class HamiltonianPath {

	int[][] hamiltonianGraph;
	int[] hamiltonianPath;
	int noOfVertex;

	HamiltonianPath(int[][] hamiltonianGraph) {
		this.hamiltonianGraph = hamiltonianGraph;
		this.noOfVertex = hamiltonianGraph[0].length;
		this.hamiltonianPath = new int[noOfVertex];
	}

	public void solve() {

		hamiltonianPath[0] = 0;

		if (setHamiltonianPath(1)) {
			printHamiltonianPath();
		} else {
			System.out.println("solution not possible");
		}
	}

	private boolean setHamiltonianPath(int path_index) {

		if (path_index == noOfVertex) {
			return hamiltonianGraph[hamiltonianPath[0]][hamiltonianPath[noOfVertex - 1]] == 1;
		}

		for (int vertex = 1; vertex < noOfVertex; vertex++) {
			if (isvalidMove(path_index, vertex)) {
				hamiltonianPath[path_index] = vertex;
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
		if(hamiltonianGraph[hamiltonianPath[path_index-1]][vertex]==0) {
			return false;
		}
		
		for (int i = 0; i < path_index; i++) {
			if (hamiltonianPath[i] == vertex) {
				return false;
			}
		}
		return true;
	}

	private void printHamiltonianPath() {
		for (int is : hamiltonianPath) {
			System.out.print(is + " ");
		}
		System.out.print(hamiltonianPath[0]);
	}

}



