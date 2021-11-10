package programs;

public class PrimeNumbers {
	
	public static void main(String array[]) {
		  checkPrime(43);  

	}
	//PrimeNumber - a number which is divisible by itself or 0
		static void checkPrime(int n){  
			   //int num = 29;
			    boolean flag = false;
			    for (int i = 2; i <= n / 2; ++i) {
			      // condition for nonprime number
			      if (n % i == 0) {
			        flag = true;
			        break;
			      }
			    }

			    if (!flag)
			      System.out.println(n + " is a prime number.");
			    else
			      System.out.println(n + " is not a prime number");
		}  

}
