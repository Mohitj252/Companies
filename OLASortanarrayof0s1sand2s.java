package main.java.companies;

import java.util.Scanner;

/**
 * Given an array A of size N containing 0s, 1s, and 2s; you need to sort the array in ascending order.

Input:
The first line contains an integer 'T' denoting the total number of test cases. Then T testcases follow. Each testcases contains two lines of input. The first line denotes the size of the array N. The second lines contains the elements of the array A separated by spaces.

Output: 
For each testcase, print the sorted array.

Constraints:
1 <= T <= 500
1 <= N <= 106
0 <= Ai <= 2

Example:
Input :
2
5
0 2 1 2 0
3
0 1 0

Output:
0 0 1 2 2
0 0 1

Explanation:
Testcase 1: After segragating the 0s, 1s and 2s, we have 0 0 1 2 2 which shown in the output.
 * 
 * 
 * @author mohitjai
 *
 */

public class OLASortanarrayof0s1sand2s {
	


	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int noOfTests = Integer.parseInt(sc.nextLine());
		int sizeOfArray;
		String[] inputArray;
		int count0 = 0, count1 = 0 , count2 = 0;

		for (int i = 0; i < noOfTests; i++) {
			sizeOfArray = Integer.parseInt(sc.nextLine());
			inputArray = new String[sizeOfArray];
			String arrayValues = sc.nextLine();
			inputArray = arrayValues.split(" ");
			
			for (int j = 0; j < inputArray.length; j++) {
				if(Integer.parseInt(inputArray[j]) == 0) {
					++count0;
				} else if(Integer.parseInt(inputArray[j]) == 1) {
					++count1;
				} else {
					++count2;
				}
			}
			
			for(int j = 0; j < inputArray.length; j++) {
				if(j < count0) {
					System.out.print("0" + " ");
				} else if((j == (count0 - 1)) || j < (count0 + count1)) {
					System.out.print("1" + " ");
				} else {
					System.out.print("2"+ " ");
				}
			}
			
		}

	}



}
