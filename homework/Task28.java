import java.util.Scanner;
public class Task28{
	public static boolean pr( String [][] m, int n, int h){
		int fl;
		int k=0;
		for (int j = 0; j < h; j += 1){
			fl = 1;
			for (int i = 0 ;i < n; i += 1){
				if (m[i][j].charAt(0) != 'E' &&   m[i][j].charAt(0) != 'Y' &&
				m[i][j].charAt(0) !='U' && m[i][j].charAt(0) != 'I'&& m[i][j].charAt(0) != 'O' && m[i][j].charAt(0) != 'A' && m[i][j].charAt(0) != 'e' &&   m[i][j].charAt(0) != 'y' &&
				m[i][j].charAt(0) !='u' && m[i][j].charAt(0) != 'i'&& m[i][j].charAt(0) != 'o' && m[i][j].charAt(0) != 'a') {
					fl = 0;
				}
				else {
					k+=1;
					break;
				}
			}
			
		}
		if (k == h){
				return true;
			}
		else{
			return false;
		}
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// строка
		int h = sc.nextInt();// столбец
		String[][] m =  new String [n][h];
		for (int i=0; i < n; i += 1){
			for (int j = 0; j < h; j += 1){
				m[i][j] = sc.next(); 
			}
		}
		System.out.print(pr(m,n,h));
	}
}