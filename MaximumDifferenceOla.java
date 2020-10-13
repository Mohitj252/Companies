package main.java.companies;

import java.util.Scanner;
/**
* You are given an array A (distinct elements) of size N. Find out the maximum difference between any two elements such that larger element appears after the smaller number in A.
Input:
The first line of input contains an integer T denoting the number of test cases. T testcases follow. Each testcase contains two lines of input. The first line of each test case is N,N is the size of array. The second line of each test case contains N elements separated by spaces.

Output:
For each testcase, print the maximum difference between two element. Otherwise print -1

Constraints:
1 <= T <= 100
2 <= N <= 107
0 <= Ai <= 107

Example:
Input:
2
7
2 3 10 6 4 8 1
6
7 9 5 6 3 2

Output:
8
2
Explanation:
Testcase1:  Array is [2, 3, 10, 6, 4, 8, 1] then returned value is 8 (Diff between 10 and 2).
Testcase2: Array is [ 7, 9, 5, 6, 3, 2 ] then returned value is 2 (Diff between 7 and 9).
* @author mohitjai
*
*/


public class MaximumDifferenceOla {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int noOfTests = Integer.parseInt(sc.nextLine());
		int sizeOfArray;
		String[] inputArray;
		int minElementValue;
		int maxDifference;

		for (int i = 0; i < noOfTests; i++) {
			sizeOfArray = Integer.parseInt(sc.nextLine());
			inputArray = new String[sizeOfArray];
			String arrayValues = sc.nextLine();
			inputArray = arrayValues.split(" ");
			minElementValue = Integer.parseInt(inputArray[0]);
			maxDifference = 0;
			for (int j = 0; j < inputArray.length; j++) {

				if ((Integer.parseInt(inputArray[j]) - minElementValue) > maxDifference) {
					maxDifference = Integer.parseInt(inputArray[j]) - minElementValue;
				}

				if (Integer.parseInt(inputArray[j]) < minElementValue) {
					minElementValue = Integer.parseInt(inputArray[j]);
				}
			}
			System.out.println(minElementValue);
			System.out.println(maxDifference);

		}

	}

}
