
public class SortingAnArray {

	public int[] sortArray(int[] testInput) {
		int[] sortedArray = new int[testInput.length];
		for (int count = 0; count < testInput.length; count++) {

			sortedArray[count] = testInput[count];
		}

		boolean flag = true;

		while (flag == true) {

			flag = false;
			for (int index = 0; index < sortedArray.length - 1; index++) {
				if (sortedArray[index] > sortedArray[index + 1]) {
					swapWithNextElement(sortedArray, index);
					flag = true;
				}
			}
		}
		return sortedArray;

	}

	private void swapWithNextElement(int[] sortedArray, int index) {
		int temp = sortedArray[index + 1];
		sortedArray[index + 1] = sortedArray[index];
		sortedArray[index] = temp;
	}

}