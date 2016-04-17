package selectionSort;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class testImplementSelectionSort {
	int[] numbers = {1, 5, 8, 6, 63, 9, 45, 10};
	
//	@Test
//	public void testFindMaxIndex() throws Exception {
//		assertEquals(4, implementSelectionSort.findMaxIndex(numbers));
//	}
	@Test
	public void testSorting() throws Exception {
		System.out.println(Arrays.toString(implementSelectionSort.sorting(numbers)));
	}

}
