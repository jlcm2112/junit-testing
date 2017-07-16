import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SortingAnArrayTest {
	// populate an array and sort it in ascending order
	
	@Test
	public void shouldReturnArray() {
		// arrange
		SortingAnArray underTest = new SortingAnArray(); 
		// act
		int[] testInput = {10, 1};
		int[] response = underTest.sortArray(testInput);
		// assert
		int[] shouldRespond = {1, 10};
		assertArrayEquals(shouldRespond, response);
	}
	
	@Test
	public void shouldReturn2And4() {
		// arrange
		SortingAnArray underTest = new SortingAnArray();
		//act
		int [] testInput = {4, 2};
		int[] response = underTest.sortArray(testInput);
		//assert
		int[] shouldRespond = {2, 4};
		assertArrayEquals(shouldRespond, response);
	}
	@Test
	public void shouldReturn3And7And10() {
		//arrange
		SortingAnArray underTest = new SortingAnArray();
		//act
		int [] testInput = {7, 10, 3};
		int[] response = underTest.sortArray(testInput);
		//assert
		int[] shouldRespond = {3, 7, 10};
		assertArrayEquals(shouldRespond, response);
	}
	@Test
	public void shouldReturn1And2And3And4And5() {
		//arrange
		SortingAnArray underTest = new SortingAnArray();
		//act
		int [] testInput = {5, 3, 4, 1, 2};
		int[] response = underTest.sortArray(testInput);
		//assert
		int[] shouldRespond = {1, 2, 3, 4, 5};
		assertArrayEquals(shouldRespond, response);
	}
	
		
	
	
}