import java.util.Scanner;
public class Task29{
	public static boolean pr(int[][] m, int n, int h){
		int fl;
		int t;
		int num;
		for (int i = 0 ;i < n; i += 1){
			fl = 0;
			for (int j = 0; j < h; j += 1){
				num = m[i][j];
				 t = 1;
				 while (num > 0){
				 	if ((num % 10) % 2 != 0){


				 		t = 0;
				 		break;
				 	}
				 	else{
				 		num = num / 10;
				 	}
				 }
				 if (t == 1){
				 	fl = 1;
				 	break;
				 }
				
			}
			if (fl == 0){
				return false;
			}
			
		}
		return true;
	} 
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// строка
		int h = sc.nextInt();// столбец
		int [][] m =  new int [n][h];
		for (int i=0; i < n; i += 1){
			for (int j = 0; j < h; j += 1){
				m[i][j] = sc.nextInt(); 
			}
		}
		System.out.print(pr(m,n,h));
	}
}