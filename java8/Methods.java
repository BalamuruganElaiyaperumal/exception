package java8;

public class Methods {

public int findmax(int[] a) {
	int max=a[0];
	
	for(int i=0; i<a.length;i++) {
		if(a[i]>=max) {
			max=a[i];
		}
		
	}
	return max;
}
}
