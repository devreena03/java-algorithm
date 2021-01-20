package algo;

public class ArrayUtil {
	
	public static void main(String[] args) {
		int[] values = {1,2,3,2,4,3,4,1,5,5};
		getDuplicate(values);
	}
	
	private static void getDuplicate(int[] values) {
		
		for(int i=0; i< values.length; i++) {
			
			int absvalue = Math.abs(values[i]);
			
			if(values[absvalue]<0) {
				System.out.print(absvalue+" ");
			} else {
				values[absvalue] = - values[absvalue];
			}
			
		}
	}

}
