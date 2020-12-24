package search;


public class SerachTest {
	
	public static void main(String[] args) {
		
		int[] values = {1,2,4,1,9,5,6};
		LinearSearch ls = new LinearSearch(values);
		System.out.println(ls.find(4));
		
		int[] values1 = {1,2,4,6,9,10,10,11};
		BinarySearch bs = new BinarySearch(values1);
		System.out.println(bs.find(56));
		
		int[] values2 = {10,6,4,4,3,1};
		BinarySearch bs2 = new BinarySearch(values2);
		System.out.println(bs2.find(3, true));
		
	}

	
}
