
public class alphabetsPattern {
public static void main(String[] args) {
	int n=9;
	for(int i=0;i<n;i++) {
//		Print A
		for(int j=0;j<n;j++) {
			if(j==0 && i>0 || i==0 && j>0 && j<(n-1)/2 || j==(n-1)/2 && i>0 || i==(n-1)/2 && j<=(n-1)/2)
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.print("  ");
//		Print B
		for(int j=0;j<n;j++) {
			if(j==0 && i>0 || i==0 && j>0 && j<(n-1)/2 || j==(n-1)/2 && i>0 && i<(n-1)/2 || i==(n-1)/2 && j<(n-1)/2 || i==n-1 && j<(n-1)/2 || j==(n-1)/2 && i>(n-1)/2 && i<n-1)
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.print("  ");
//		Print C
		for(int j=0;j<n;j++) {
			if(j==0 && i>0 && i<n-1 || i==0 && j>0 && j<n-1 || i==n-1 && j>0 && j<n-1)
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.print("  ");
//		Print D
		for(int j=0;j<n;j++) {
			if(j==0 && i>0 && i<n-1 || i==0 && j>0 && j<(n-1)-1 || i==n-1 && j>0 && j<(n-1)-1 || j==n-1 && i>1 && i<(n-1)-1 || i==1 && j==(n-1)-1 || i==(n-1)-1 && j==(n-1)-1)
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.print("  ");
//		Print E
		for(int j=0;j<n;j++) {
			if(j==0 || i==0 || i==n-1 || i==(n-1)/2)
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.print("  ");
//		Print F
		for(int j=0;j<n;j++) {
			if(j==0 || i==0  || i==(n-1)/2)
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.print("  ");
//		Print G
		for(int j=0;j<n;j++) {
			if(i==0 && j>=(n-1)/2 || i+j==(n-1)/2 || i-j==(n-1)/2 || j==(n-1)/2 && i>=(n-1)/2 || i==(n-1)/2 && j>=(n-1)/2 || j==n-1 && i>=(n-1)/2)
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.print("  ");
//		Print H
		for(int j=0;j<n;j++) {
			if(j==0 || j==n-1 || i==(n-1)/2)
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println();
	}
}
}
