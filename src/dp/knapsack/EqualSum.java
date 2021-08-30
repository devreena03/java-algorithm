package dp.knapsack;

import java.util.Arrays;

public class EqualSum {
	
	public static void main(String[] args) {
		EqualSum obj = new EqualSum();
		int[] a = { 1, 5, 11, 5};
	
		System.out.println(obj.evaluate(a));
	}
	
	public boolean evaluate(int[] arr) {
		int n = arr.length;
		int sum = Arrays.stream(arr).sum();
		System.out.println(sum);
		return true;
	}
}
