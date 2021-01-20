package dynamic.programming;

public class AlgoTest {
	
	public static void main(String[] args) {
		
		//fibonacciNumberTest();
		
		//knapsackTest();
		
		//rodCutting();
		
		//subsetSum();
		
//		largestSumSubarray();
		
		eggTest();
		
	}

	private static void eggTest() {
		EggFloorProblem egg = new EggFloorProblem();
		System.out.println(egg.solve());
		
	}

	private static void largestSumSubarray() {
		//int[] values = {0, 1, 3, -5, 4, -3, 8 }; //4,-3,8
		//int[] values = {0, 1, -2, 3, 4, -8, 12 }; // 12
		int[] values = {0, 8, -5, 4, 3, -2, 1 }; // 8,-5,4,3
		LargestSumSubarray s = new LargestSumSubarray(values);
		s.solve();
		s.showSubArray();
		
	}

	private static void subsetSum() {
		int sum = 5;
		int[] integerList = {0,4,2,-2,3,1};
		SubsetSum s = new SubsetSum(sum, integerList);
		s.solve();
		s.showResult();
		
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
