package String_Progrm;

public class Remove_Space {
	public static void main(String[]args) {
		String s="roshanmorkhade";
		char a []=s.toCharArray();
		for(int i=0;i<a.length-1;i++) {
			
			for(int j=1;j<a.length-1;j++) {
				if(a[i]==a[j]) {
					System.out.print(a[j]);
					
				}
			}
			
			
			
		}
		
	}

}
