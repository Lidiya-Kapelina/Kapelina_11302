import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Task7{
	public static void main(String [] args){
	Scanner scanner = new Scanner(System.in);
    String s = scanner.nextLine();
    Pattern p1 = Pattern.compile("[a-z][a-zA-Z0-9_]*") ;
    Matcher p2 = p1.matcher(s) ;
    System.out.print(p2.matches());
	}
}