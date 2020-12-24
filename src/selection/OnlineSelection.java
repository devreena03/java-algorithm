package selection;

//The secretary problem
public class OnlineSelection {
	
	int[] values;
	
	public OnlineSelection(int[] values) {
		this.values = values;
		
	}
	
	public int max() {
		int subArrayLength=10;
		int max = maxOfSub(subArrayLength);
		System.out.println(max);
		for(int i = subArrayLength; i<values.length; i++) {
			if(values[i]>max) {
				max = values[i];
				break;
			}
		}
		return max;
		
	}

	private int maxOfSub(int length) {
		int max=0;
		for(int i=0; i<10; i++) {
			if(values[i]>max) {
				max = values[i];
			}
		}
		return max;
	}

}
