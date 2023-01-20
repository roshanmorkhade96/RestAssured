package array_program;
public class Positve_Negative { 
public static void main(String[]args) {
	int a[]= {1,-2,3,-4,-5,5,7};
	int pos=0;
	int neg=0;
	for(int i=0;i<a.length;i++) {
		if(a[i]>0) {
			pos++;
		}
		else {
			neg++;
		}
	}
	System.out.println("postive number="+pos+"  negative number="+neg);
	}
}
