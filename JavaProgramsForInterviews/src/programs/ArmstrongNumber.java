package programs;

public class ArmstrongNumber {

	public static void main(String[] args) {
		//Cube of each digit inside the number should be equal to number itself.
		//Ex- 153,
		//1*1*1=1
		//5*5*5=125
		//3*3*3=27
		//1+125+27=153
		
		int input =153;
		int cube = 0;
		int temp,r;
		temp = input;
		
		while(input>0) {
			r = input%10;
			input = input/10;
			cube = cube +(r*r*r);
		}
		
		if(temp==cube) {
			System.out.println(temp+" is Armstrong number");
		}else {
			System.out.println(temp+" is not Armstrong number");
		}
		

	}

}
