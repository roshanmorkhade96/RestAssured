package array_program;

public class Count_Even_Odd {
	public static void main(String[]args) {
		int [] a= {20,30,50,2,3,1,5,6,8};
		int evn=0;
		int odd=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				evn++;
			}
			else {
				odd++;
			}
		}
		System.out.println("count evn="+evn+"count oodd="+odd);
	}

}
