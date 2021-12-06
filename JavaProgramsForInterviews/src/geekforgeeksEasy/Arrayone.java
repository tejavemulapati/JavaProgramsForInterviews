package geekforgeeksEasy;

public class Arrayone {
	/*
	 * For a given array of price of items,you have to calculate the average of all prices upto 2 decimal places.
Note: Sum is printed automatically, you only need to calculate and return the average

Example 1:

Input:
5
1 2 3 4 5
Output:
15 3.00 
Explanation:
Sum of the array is 15, hence 
average is 15/5=3.00. 

Your Task:  
You don't need to read input or print anything. Y
our task is to complete the function average() 
which takes the array A[] and  its size N as inputs 
and returns the average of all the items as a String.
	 */

	public static void main(String[] args) {
		int a[] = {47,33443};
		System.out.println(average(a,2));

	}
	
	public static String average(int A[], int N)
    {
        double sum=0;
        float average =0;
        for(int i=0;i<N;i++){
             sum += A[i];
        }
        average = (float) (sum*1.0/N);
        String result = String.format("%.2f",average);
        return result;
    }

}
