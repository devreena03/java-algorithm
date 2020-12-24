package recursion;

public class FebonasisTest {
	public static void main(String[] args) {
		
//		FebonasisNumber feb = new FebonasisNumber();
//		System.out.println(feb.head(10));
//		
//		System.out.println(feb.tail(10));
		
		FebonasisSeries feb1 = new FebonasisSeries();
		feb1.iterative(10);
		
		feb1.head(10);
	}

}
