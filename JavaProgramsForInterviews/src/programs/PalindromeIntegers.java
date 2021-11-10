package programs;

public class PalindromeIntegers {

	public static void main(String[] args) {
		int r, temp;
		int sum = 0;
		int input =121;
		temp = input;
		
		while(input>0) {
			r = input%10;
			sum = (sum*10)+r;
			input = input/10;
		}
		if(temp==input) {
			System.out.println("Number is palindrome");
		}
		else {
			System.out.println("Number is not palindrome");
		}
		
//		  int r,sum=0,temp;    
//		  int n=121;//It is the number variable to be checked for palindrome  
//		  
//		  temp=n;    
//		  while(n>0){    
//		   r=n%10;  //getting remainder  
//		   sum=(sum*10)+r;    
//		   n=n/10;    
//		  }    
//		  if(temp==sum)    
//		   System.out.println("palindrome number ");    
//		  else    
//		   System.out.println("not palindrome");   
//		
	}

}
