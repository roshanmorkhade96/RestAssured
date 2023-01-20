package basic_program;

public class Factorial_Number {
	public static void main(String[]args) {
	int n=3;
	int fact=1;
	for(int i=1;i<=n;i++) {
		fact=fact*n;
	}
System.out.println(fact);
}
}