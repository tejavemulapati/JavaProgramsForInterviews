package numericPrograms;

public class PrintValidArray {

	//public static int array1[] = {1,2,3,4,5,6,7,8,9,10};
	public static int array1[] = {10,9,8,7,6,5,5,3,2,1};
	//public static int array1[] = {1,2,3,4,5,5,7,8,9,10};
	public static void main(String[] args) {
//		Given Integer Array {1,2,3,4,5,6,7,8,9,10}
//		The above array can be called as valid Array only if below conditions are met: 
//		1)Increasing order {1, 3, 5, 7}
//		2)Decreasing order {9, 6, 3, 1}
//		3)Duplicate characters at consecutive positions {1, 2, 1, 5, 5, 7}
//		4)Else Invalid
		
		//System.out.println(increasing_order(array1));
		//System.out.println(decreasing_order(array1));
		
		if((increasing_order(array1))|| (decreasing_order(array1) ==true)){
			System.out.println("Array is valid");
		}else {
			System.out.println("Array is not valid");
		}
		
	}
	
	public static boolean increasing_order(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			if(!(a[i]<=a[i+1])) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean decreasing_order(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			if(!(a[i]>=a[i+1])) {
				return false;
			}
		}
		return true;
	}

}
