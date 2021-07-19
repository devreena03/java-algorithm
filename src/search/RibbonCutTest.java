package search;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RibbonCutTest {
	
	RibbonCut rd = new RibbonCut();
	
	int arr[] = {1, 2, 3, 4, 9}; 
	
	@Test
	public void maxProfit() throws Exception {
		assertEquals(3, rd.maxLength(arr, 5));
	}
	
}
