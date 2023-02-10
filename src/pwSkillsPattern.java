
public class pwSkillsPattern {
public static void main(String[] args) {
	int n=10;
	for(int i=0;i<n;i++) {
//		Print P
		for(int j=0;j<n;j++) {
			if(j==0 && i>0 || i==0 && j>0 && j<(n-1)/2 || j==(n-1)/2 && i>0 && i<(n-1)/2 || i==(n-1)/2 && j<(n-1)/2)
			System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.print(" ");
//		Print W
		for(int j=0;j<n;j++) {
			if(j==0 || j==n-1 || i+j==n-1 && i>=(n-1)/2 || i==j && j>=(n-1)/2)
			System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.print(" ");
//		Print S
		for(int j=0;j<n;j++) {
			if(j==0 && i>0 && i<(n-1)/2 || i==0 && j>0 && j<(n-1)/2 || i==(n-1)/2 && j>0 && j<(n-1)/2 || j==(n-1)/2 && i>(n-1)/2 && i<n-1 || i==n-1 && j>0 && j<(n-1)/2 || j==(n-1)/2 && i==1 || j==0 && i==n-2)
			System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.print(" ");
//		Print K
		for(int j=0;j<n;j++) {
			if(j==0 || i+j==(n-1)/2 || i-j==(n-1)/2)
			System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.print(" ");
//		Print I
		for(int j=0;j<n;j++) {
			if(i==0 || i==n-1 || j==(n-1)/2)
			System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.print(" ");
//		Print L
		for(int j=0;j<n;j++) {
			if(j==0 || i==n-1)
			System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.print(" ");
//		Print L
		for(int j=0;j<n;j++) {
			if(j==0 || i==n-1)
			System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.print(" ");
//		Print S
		for(int j=0;j<n;j++) {
			if(j==0 && i>0 && i<(n-1)/2 || i==0 && j>0 && j<(n-1)/2 || i==(n-1)/2 && j>0 && j<(n-1)/2 || j==(n-1)/2 && i>(n-1)/2 && i<n-1 || i==n-1 && j>0 && j<(n-1)/2 || j==(n-1)/2 && i==1 || j==0 && i==n-2)
			System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println();
	}
}
}
