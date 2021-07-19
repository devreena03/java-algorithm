package backtracking.combination;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
	
	List<List<Integer>> result;
	
	public List<List<Integer>> allSubSetSum(int[] arr, int sum){
		result = new ArrayList<>();
		//arr = [2,3,6,7]
		allCombination(arr, sum, 0, new ArrayList<>());
		return result;
		
	}

	private void allCombination(int[] arr, int sum, int i, ArrayList<Integer> list) {
		
		if(sum==0) {
			result.add(new ArrayList<>(list));
			return;
		}
		
		if(i==arr.length) return;
		
		int ele = arr[i];
		if(ele<=sum) {
			list.add(ele);
			allCombination(arr, sum-ele, i, list);//include
			//backtrack and remove last added element so that can call next recursive call with not included
			list.remove(list.size()-1);
			allCombination(arr, sum, i+1, list); //excluded
		} 
		
	}

}
