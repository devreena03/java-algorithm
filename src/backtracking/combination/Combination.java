package backtracking.combination;

import java.util.ArrayList;
import java.util.List;

public class Combination {
	
	public static void main(String[] args) {
		Combination obj = new Combination();
		//print(obj.getCombinations(new int[] {1,2,3}));
		printString(obj.getStringCombinations("abc"));
	}

	public List<List<Integer>> getCombinations(int[] arr){
		 
		 return getCombinations(arr,arr.length);
		
	}
	
	public List<String> getStringCombinations(String value){
		
		if(value.length()==1) {
			List<String> result = new ArrayList<>();
			result.add("");
			result.add(value);
			return result;
		}
		
		char a = value.charAt(0);
		List<String> result = getStringCombinations(value.substring(1));
		int size = result.size();
		for(int i=0; i<size; i++) {
			result.add(result.get(i)+a);
		}
		return result;
	}

	private List<List<Integer>> getCombinations(int[] arr, int n) {
		
		if(n==0) {
			List<List<Integer>> result = new ArrayList<>();
			result.add(new ArrayList<>());
			return result;
		}
		
		int a = arr[n-1];
		List<List<Integer>> result = getCombinations(arr, n-1); //all combination without last ele(a)
		int size = result.size();
		
		for(int i=0; i<size; i++) {
			List<Integer> withEle = new ArrayList<>(result.get(i));
			withEle.add(a);	
			result.add(withEle);//all combination with last ele(a)
		}
		
		return result;
	}
	
	private static void printString(List<String> stringCombinations) {
		System.out.print("[");
		for (String val : stringCombinations) {
			System.out.print(val+", ");
		}
		
	}
	
	public static void print(List<List<Integer>> combinations) {
		for (List<Integer> list : combinations) {
			System.out.print("[");
			for(Integer val: list) {
				System.out.print(val+" ");
			}
			System.out.println("]");
		}
		
	}

}
