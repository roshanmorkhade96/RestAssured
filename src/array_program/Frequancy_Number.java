package array_program;

public class Frequancy_Number {
	public static void main(String[]args) {
		int a[]= {10,20,30,40,50,30,30,303,30};
		int n=30;
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==n) {
				count++;
			}
		}
		System.out.println(count);
	}

}
