
import java.util.Scanner;
public class Task8{
	public static void main(String [] args){
	int k = 0;
	Scanner scanner = new Scanner(System.in);
    String s = scanner.nextLine();
	for (int i = 0 ; i < s.length() ; i += 1){
		if ( s.charAt(i) ==  '('){
			k += 1;
		}
		else if ( s.charAt(i) ==  ')'){
			k -= 1;
		}
		if (k<0){
		System.out.print("Wrong");
			break;
		}
		if (i == s.length() && k!=0){
			System.out.print("Wrong");
		}
		else if (i == s.length()-1){
			System.out.print("Right");
		}
	}
	}
}