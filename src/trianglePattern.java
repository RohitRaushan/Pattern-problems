
public class trianglePattern {
public static void main(String[] args) {
	int n=9;
	for(int i=0;i<n;i++) {
		for(int j=0;j<n-i;j++) {
			System.out.print(" ");
		}
		for(int k=1;k<2*i;k++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
