package array_program;

public class Duplicattes_Array {
	public static void main(String[]arg) {
		int duplicate=0;
		int [] a= {10,20,30,40,50,10,20,30};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					duplicate=a[i];
					System.out.println("duplicate number"+duplicate);
				}
			}
		}
		
	}

}