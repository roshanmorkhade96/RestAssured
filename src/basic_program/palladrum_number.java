package basic_program;

public class palladrum_number {
public static void main(String[]args) {
	int n=122;
	int a=0;
	int b=0;
	int c=n;
	while(n>0) {
	a=n%10;
	n=n/10;
	b=(b*10)+a;
	
	}
	if(c==b) {
		System.out.println("Given number is palladrum");
	}
	else {
		System.out.println("given number is not palladrum");
	}
}
}
