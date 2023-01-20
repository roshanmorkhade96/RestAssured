package array_program;

public class Missing_Number {
	public static void main(String[]args) {
	int a[]= {1,2,3,4,5,7};
	int add1=0;
	for(int i=0;i<a.length;i++) {
		add1=add1+a[i];
		
	}
	int n=7;
	int add2=0;
	for(int j=1;j<=n;j++) {
		add2=add2+j;
	}
	System.out.println(add2-add1);
			}
}
