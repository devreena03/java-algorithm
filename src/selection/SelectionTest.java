package selection;

public class SelectionTest {
	
	public static void main(String[] args) {
		int[] values = {1,8,8,3,6,5,10,9};
		
		QuickSelect q = new QuickSelect(values);
		System.out.println(q.selectMin(2));
		
		System.out.println(q.selectMax(4));
		
		q.sort();
		
		int[] values1 = {1,8,8,3,6,5,10,9,89,67,54,12,3,4,7,12,12,14,56,87,98,90,76};
		OnlineSelection o = new OnlineSelection(values1);
		System.out.println(o.max());
		
	}

}
