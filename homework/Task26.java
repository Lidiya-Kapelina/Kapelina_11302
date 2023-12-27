import java.util.Scanner;
public class Task26{
	public static boolean pr( int [] m, int n){
		int fl;
		int sign;
		int a;
		for (int u = 0;u < n;u += 1){
			if (m[u] > 0){
				a = m[u];
				fl = 0;
				while (a > 0){
					sign = a % 10;
					a = a / 10;
					if ((sign % 2) == 0) {
						fl = 1;
					}
				}
				if (fl == 0){
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] m = new int[n];
		for (int i = 0; i < n; i += 1){
			m[i] = sc.nextInt(); 
		}
		System.out.print(pr(m,n));
	}
}