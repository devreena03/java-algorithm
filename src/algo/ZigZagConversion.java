package algo;

public class ZigZagConversion {
	
	public static void main(String[] args) {
		ZigZagConversion obj = new ZigZagConversion();
		System.out.println(obj.solveByMatrix("PAYPALISHIRING", 3));
		
		obj.solveWithStringBuilder("PAYPALISHIRING", 3);
	}
	
	public void solveWithStringBuilder(String value, int row) {
		
		//initialize
		row = Math.min(row, value.length()); //length=2, row=3
		StringBuilder[] rows = new StringBuilder[row];
		for(int i=0; i < row ; i++) {
			rows[i] = new StringBuilder();
		}
		
		//filling rows
		int i =0;
		boolean increment = true;
		for(char c: value.toCharArray()) {
			rows[i].append(c);				
			if(i==row-1)
				increment = false;
			if(i==0)
				increment = true;
			
			i += increment ? 1 : -1;
		}
		
		//converting to single string
		StringBuilder sb = new StringBuilder();
		for(int j=0; j < row ; j++) {
			sb.append(rows[j].toString());
		}
		
		System.out.println(sb.toString());
		
	}

	public String solveByMatrix(String value, int row) {
		
		int col = value.length()/2;
		if(value.length()%2!=0) {
			col++;
		}
		
		char[][] zigzag = new char[row][col];
		
		char[] arr= value.toCharArray();
		
		int i=0;
		int count = 0 ;
		for(int j=0; j<col&&count<arr.length; j++,i--,count++) {
			if(i==0) {
				for(; i<row && count<arr.length; i++, count++) {
					zigzag[i][j] = arr[count];
				}
				i--;
				count--;
			} else {
				zigzag[i][j] = arr[count];			
			}
		}
		
		printMatrix(zigzag);
		
		return getZigZagString(zigzag);
		
	}

	private String getZigZagString(char[][] zigzag) {
		String str="";
		for (int i = 0; i < zigzag.length; i++) {
			for (int j = 0; j < zigzag[0].length; j++) {
				if(zigzag[i][j]!=0) { //empty cell
					str+=zigzag[i][j];
				}
			}
		}
		return str;
	}

	private void printMatrix(char[][] zigzag) {
		for (int i = 0; i < zigzag.length; i++) {
			for (int j = 0; j < zigzag[0].length; j++) {
				if(zigzag[i][j]==0) { //empty cell
					System.out.print(" ");
				}
				System.out.print(zigzag[i][j]);
			}
			System.out.println();
		}

		
	}

}
