package array_program;

public class Maximum_Array {
	public static void main(String[]args) {
		int a[]= {10,20,30};
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println(max);
		
	}

}
