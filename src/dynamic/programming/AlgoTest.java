package dynamic.programming;

public class AlgoTest {
	
	public static void main(String[] args) {
		
		//fibonacciNumberTest();
		
		//knapsackTest();
		
		rodCutting();
		
	}

	private static void rodCutting() {
		int rodLength = 5;
		int[] rodPrices = {0,2,2,9,8,9};
		RodCutting r = new RodCutting(rodLength, rodPrices);
		r.solve();
		r.showResult();
		
	}

	private static void knapsackTest() {
		 int noOfItems = 4;
		 int capacity = 10;
		 int[] itemWeights = {0,4,2,3,5};
		 int[] itemValues = {0,15,5,7,13};
		 
		 Knapsack k = new Knapsack(noOfItems, capacity, itemWeights, itemValues);
		 k.solve();
		 k.showResult();
		
	}

	private static void fibonacciNumberTest() {
		FibonacciNumber fn = new FibonacciNumber();
		System.out.println(fn.recursive(20));
		System.out.println(fn.memorization(20));
		System.out.println(fn.tabulation(20));
	}

}
