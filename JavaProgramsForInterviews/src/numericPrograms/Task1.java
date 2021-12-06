package numericPrograms;

import java.util.Arrays;

public class Task1 {
	
	/*Write a function:
	 * class Solution { public int solution(int[] A);}
	 * that, given an array A of N integers, returns the smallest positive integer
	 * (greater than 0) that does not occur in A
	 * 
	 * For Example, given A = [1,3,6,4,1,2], the function should return 5.
	 * 
	 * Given A = [1,2,3], the function should return 4.
	 * Given A = [-1,-3], the function should return 1.
	 * 
	 * Write an efficient algorithm for the following assumptions:
	 * 
	 * N is an integer within the range [1..100,000];
	 * each element of array A is an integer within the range
	 * [-1,000,000..1,000,000].
	 * 
	 */
	public static int returnSmallestPositivenumber(int[] a) {
		Arrays.sort(a);
		String strArraySorted = Arrays.toString(a);
		System.out.println("Sorted Array is "+strArraySorted);
		System.out.println("Smallest element in  Array is "+a[0]);
		//check for next smallest number in the array, if present then increment the value and then search.
		//if the incremented value is not there in the array then return the element
		int smallest_num = a[0];
		int next_smallest=0;
		int largest_number = a[a.length-1];
		int i=0;
		smallest_num = smallest_num +1;
		System.out.println("current value of smallest num--> "+smallest_num);
		for(i=i+1;i<a.length;i++) {
			System.out.println("current value of a[i]--> "+a[i]);
			if(smallest_num==a[i]) {
				System.out.println("inside if loop a[i]--> "+a[i]);
			}
			int smallest_num2 = smallest_num +1;
			i =1;
		}
		return next_smallest;
	}

	public static void main(String[] args) {
		int b[] = {1,3,6,4,1,2};
		System.out.println(returnSmallestPositivenumber(b));
	}

}
