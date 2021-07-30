package com.bridgelabz.sorting.service;
import com.bridgelabz.sorting.util.ArrayMethod;

public class MergeSort {
	// Declaring array size and the array and temp array

	private static int arraySize;
	private static String wordsArray[];
	private static String[] temp;

	/**
	 * @performMergeSort is a method for dividing array
	 * by taking lower middle and higher index of array
	 * @param lowIndex is lower index of array.
	 * @param highIndex is higher index of array.
	 */
	public static void performMergeSort(int lowIndex, int highIndex) {

		if (lowIndex < highIndex) {
			
			int midIndex = lowIndex + (highIndex - lowIndex) / 2;
			
			//for sorting left side array element
			performMergeSort(lowIndex, midIndex);
			
			//for sorting right side array element
			performMergeSort(midIndex + 1, highIndex);
			// Sorting divided array 
			mergeSort(lowIndex, midIndex, highIndex);
		}
	}
	/**
	 * Performs merge sort on the string array
	 */
	public static void mergeSort(int lowIndex, int midIndex, int highIndex) {
		
		for (int i = lowIndex; i <= highIndex; i++) {
			temp[i] = wordsArray[i];
		}
		int i = lowIndex;
		int j = midIndex + 1;
		int k = lowIndex;
		
		while (i <= midIndex && j <= highIndex) {
			
			if (temp[i].compareTo(temp[j]) < 0) {
				wordsArray[k] = temp[i];
				i++;
			} else {
				wordsArray[k] = temp[j];
				j++;
			}
			k++;
		}
		while (i <= midIndex) {
			wordsArray[k] = temp[i];
			k++;
			i++;
		}
	}
	public static void main(String[] args) {

		ArrayMethod a = new ArrayMethod();
		arraySize = a.userInputArraySize();
		wordsArray = a.storeWordsInArray(arraySize);
		temp = new String[arraySize];
		performMergeSort(0, arraySize - 1);
		a.printArray(arraySize, wordsArray);
	}
}
