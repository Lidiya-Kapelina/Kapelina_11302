import java.util.Scanner;
public class Task24{
	public static boolean pr( int [] m, int n){
		int kol = 0;
		for (int u = 0;u < n;u += 1){
			if (m[u] < 0){
				kol += 1;}
			if (kol >= 2){
				return true;
			}
		}
		return false;

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