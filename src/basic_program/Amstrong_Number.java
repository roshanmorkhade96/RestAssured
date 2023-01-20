package basic_program;

public class Amstrong_Number {
	public static void main(String[]args) {
		int n=153;
		int a=0;
		int b=0;
		int c=n;
		while(n>0) {
			a=n%10;//3 5 1
			n=n/10;//15 5 0
			b=b+a*a*a;//27 125+27+1= 153
		}
		if(c==b) {
			System.out.println("given number is  Armstrong number ");
		}
		else {
			System.out.println("given number is not Armstrong number");
		}
	}

}
