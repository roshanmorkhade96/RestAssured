package basic_program;
public class phibonacy_series {
public static void main(String[]args) {
	int n=5;
	int a=0;
	int b=1;
	int c=0;
	for(int i=0;i<=n;i++) {
		c=a+b;
		a=b;
		b=c;
		System.out.print(c+" ");
	}
}
}
