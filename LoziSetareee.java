import java.util.Scanner;

public class LoziSetareee {
	public static char[][] matrix;
	public static int N;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		N=n;
		matrix = new char[n][2 * n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2 * n; j++) {
				matrix[i][j] = ' ';
			}
		}

		MadeDiamond(n,n/2,n/2,-1);
		MadeDiamond(n,n/2,2 * n - n / 2 - 1,-1);
		
		MadeDiamond(n,n/2,n/2,1);
		MadeDiamond(n,n/2,2 * n - n / 2 - 1,1);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2 * n; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}

	public static void MadeDiamond(int n, int i,int j,int l) {
		 if(i>=0 && i<N){
			for(int k=0;k<=n/2;k++){
				if(j-k>=0){
					matrix[i][j-k]='*';
				}
					matrix[i][j+k]='*';
			}
			MadeDiamond(n-2,i+l, j,l);
		}
	}
}
