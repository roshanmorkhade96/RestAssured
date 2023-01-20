package basic_program;


public class Prime_Number {
	public static void main (String[]args) {
	int n=13;
	int b=n/2;
	int c=0;
	if(n==0||n==1) {
		System.out.println("given number is not prime number");
		
	}
	else {
		for(int i=0;i<b;i++) {
			if(n%2==0) {
				System.out.println("given number is not prime");
				c=1;
				
			}
		}
	}
	if(c==0) {
		System.out.println("given number is prime number");
	}
	}
}
