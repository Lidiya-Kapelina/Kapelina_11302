import java.util.Scanner;
public class Task27{
	public static boolean pr( double [][] m, int n, int h){
		int fl;
		for (int i = 0; i < n; i += 1){
			fl = 1;
			for (int j = 0; j < h; j += 1){
				if (m[i][j] % 3 != 0) {
					fl = 0;
				}
			}
			if (fl == 1){
				return true;
			}
		}
		return false;
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int h = sc.nextInt();
		double [][] m =  new double [n][h];
		for (int i=0; i < n; i += 1){
			for (int j = 0; j < h; j += 1){
				m[i][j] = sc.nextDouble(); 
			}
		}
		System.out.print(pr(m,n,h));
	}
}