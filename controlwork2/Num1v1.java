import java.util.Scanner;
public class Num1v1{
	public static boolean prov(String [] m, int n){
		int kol = 0;
		int fl;
		int lmi;

		for (int i=0; i<n; i+=1){
			fl = 1;
			lmi = m[i].length();
			for (int u = 0; u < (lmi/2);u += 1){
				

				if (m[i].charAt(u) != m[i].charAt(lmi - 1 - u)){
					System.out.println(""+m[i].charAt(u) + "|" + m[i].charAt(lmi - 1 - u));
					fl = 0;
					break;

				}
			}
			if (fl == 1){
				kol += 1;
			}
			if (kol > 2){
				return false;
			}
		}
		if (kol == 2){
			return true;
		} else{
			return false;
		}


	}



	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String er = sc.nextLine();
		String [] m = new String [n];
		for (int i=0; i<n; i += 1){
			m[i] = sc.nextLine();

		}
		System.out.print(prov(m,n));



	}
}