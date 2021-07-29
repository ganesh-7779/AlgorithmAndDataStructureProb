
/*********************************************
 * Purpose : Checking String is Anagram Or Not
 * @author Ganesh Gavhad
 * @version 1.0;
 *********************************************/
package AnagramDetection.com.bridgelabz;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramDetection {
	static String firstString;
	static String secoundString;
	static char[] array1;
	static char[] array2;

	/**
	 * taking user input Two different String
	 */
	public static void userInputString() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String  ");
		firstString = sc.next();
		System.out.println("Enter Secound String  ");
		secoundString = sc.next();
		sc.close();
	}

	/**
	 * converting String Into Lower case
	 */
	public static void lowerCase() {
		System.out.println(firstString.toLowerCase() + " " +secoundString.toLowerCase());
	}

	/**
	 * @return array1 which is string converted into char array
	 */
	public static char[] convertTocharArray1() {
		array1 = firstString.toCharArray();
		return array1;
	}

	/**
	 * @return array2 which is string converted into char array
	 */
	public static char[] convertTocharArray2() {
		array2 = secoundString.toCharArray();
		return array2;
	}

	/**
	 * sorting char array
	 */
	public static void sort() {

		Arrays.sort(array1);
		Arrays.sort(array2);
	}

	/**
	 * @return 1 if two string char array are equal
	 * checking equality of length and element of char array
	 */
	public static int checkAnagram() {
		
		if (array1.length != array2.length) 
			return 1;
		
		for (int i = 0; i < array1.length; i++) {
				if (array1[i] != array2[i]) {
					return 1;
				}  
			}
		return 0;
		}
	

	public static void main(String[] args) {
		userInputString();
		lowerCase();
		convertTocharArray1();
		convertTocharArray2();
		sort();
		int check = checkAnagram();
		if( check ==1) {
			System.out.println("Not Anagram");
		}else {
		System.out.println("Anagram");
		}
	}
}
