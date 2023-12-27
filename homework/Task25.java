import java.util.Scanner;
public class Task25{
	public static boolean pr (String n){
		int kol = 0;
		for (int i = 0; i<n.length(); i+=1){
			if (n.charAt(i) == 'e' || n.charAt(i) == 'y' || 
				n.charAt(i) =='u' || n.charAt(i) == 'i'|| n.charAt(i) == 'o' || n.charAt(i) == 'a' || n.charAt(i) == 'E' || n.charAt(i) == 'y' || 
				n.charAt(i) =='U' || n.charAt(i) == 'I'|| n.charAt(i) == 'O' || n.charAt(i) == 'A'){
				kol += 1;
			}
			if (kol==4) {
				return false;
			}
		}
		if (kol == 3){
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();

		
		System.out.print(pr(n));
	}
}