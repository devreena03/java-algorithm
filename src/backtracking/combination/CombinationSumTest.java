package backtracking.combination;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class CombinationSumTest {
	
	CombinationSum obj = new CombinationSum();
	
	@Test
	public void allSubsetSumInSortedArray() throws Exception {
		int target = 7;
		int[] arr = {2,3,6,7};
		assertSubset(target, arr);
		
	}
	
	@Test
	public void allSubsetSumUnsortedArray() throws Exception {
		int target = 7;
		int[] arr = {6,7,3,2};
		assertSubset(target, arr);
		
	}

	private void assertSubset(int target, int[] arr) {
		List<List<Integer>> allSubSetSum = obj.allSubSetSum(arr, target);
		Combination.print(allSubSetSum);
		for (List<Integer> list : allSubSetSum) {
			int actual  = list.stream().reduce(0,(a,b)->a+b);
			assertEquals(target, actual);
		}
	}

}
