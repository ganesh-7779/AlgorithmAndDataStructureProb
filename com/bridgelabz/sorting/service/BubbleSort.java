package com.bridgelabz.sorting.service;


import com.bridgelabz.sorting.util.ArrayMethod;

public class BubbleSort {
	// Declaring array size and the array
	private static Integer arraySize;
	private static Integer intsArray[];

	/**
	 * To perform bubble sort on integer array. Repeatedly swaps two adjacent
	 * numbers if they are in wrong order. Outer for loop to increment the number of
	 * passes. After one pass the largest number would be in its correct place i.e
	 * last place and so on for subsequent passes. Inner for loop to traverse
	 * through array.
	 */
	public static void peformBubbleSort() {
		for (int i = 0; i < intsArray.length - 1; i++)
			for (int j = 0; j < intsArray.length - i - 1; j++)
				// Swap if next number is bigger
				if (intsArray[j] > intsArray[j + 1]) {
					int temp = intsArray[j];
					intsArray[j] = intsArray[j + 1];
					intsArray[j + 1] = temp;
				}
	}

	public static void main(String[] args) {
		ArrayMethod a = new ArrayMethod();
		arraySize = a.userInputArraySize();
		intsArray = a.storeIntsInArray(arraySize);
		peformBubbleSort();
		a.<Integer>printArray(arraySize, intsArray);

	}

}
