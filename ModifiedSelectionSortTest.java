import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ModifiedSelectionSortTest {

	@Test
	void test() {
		ModifiedSelectionSort m = new ModifiedSelectionSort();
		int[] list = {1, 5, 4, 6, 8, 7, 3, 0, 2};
		int[] copy = {1, 5, 4, 6, 8, 7, 3, 0, 2};
		
		m.modifiedSelectionSort(list);
		
		for(int i = 0; i < list.length; i++) {
			assertTrue(list[i] == i);
		}
		
		// This algorithm is as fast as the standard selection sort.
		// Its complexity class is the same as the standard selecton sort.
	}

}
