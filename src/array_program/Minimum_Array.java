package array_program;

public class Minimum_Array {
	public static void main(String[]args) {
		int a[]= {10,12,13,15};
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println(min);
	}

}
