package sorting.simpleSorting;

import sorting.AbstractSorting;
import util.Util;

/**
 * The bubble sort algorithm iterates over the array multiple times, pushing big
 * elements to the right by swapping adjacent elements, until the array is
 * sorted.
 */
public class BubbleSort<T extends Comparable<T>> extends AbstractSorting<T> {
	

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {

		if(leftIndex < rightIndex && rightIndex < array.length) {
			for (int i = leftIndex; i < rightIndex; i++) {
				for (int j = i + 1; j < rightIndex + 1; j++) {
					if (array[i].compareTo(array[j]) > 0) {
						Util.swap(array, i, j);
					}
				}
			}
		}
	}
}  
