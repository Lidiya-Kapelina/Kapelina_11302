import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Task9{
	public static void main(String [] args){
	Scanner scanner = new Scanner(System.in);
    String s = scanner.nextLine();
    int k = 0;
    String s1 = "";
    for(int i = 0;i < s.length();i += 1){
    	if (s.charAt(i) =='@'){
    		System.out.print("false");
    		k = 1;
    		break;

    	}
    	if (s.charAt(i) == '*'){
    		s1 = s1 + "@";
    	}
    	else{
    		s1 = s1 + Character.toString(s.charAt(i));
    	}
    }
    if (k == 0){
    Pattern p1 = Pattern.compile("[a-z]=[+-]?[1-9][0-9]*[+-/@][+-]?[1-9][0-9]*") ;
    Matcher m1 = p1.matcher(s1) ;
    Pattern p2 = Pattern.compile("[a-z]=[a-z][+-@][+-]?[1-9][0-9]*") ;
    Matcher m2 = p2.matcher(s1) ;
    Pattern p3 = Pattern.compile("[a-z]=[+-]?[1-9][0-9]*[+-/@][a-z]") ;
    Matcher m3 = p3.matcher(s1) ;
    Pattern p4 = Pattern.compile("[a-z]=[a-z][+-/@][a-z]") ;
    Matcher m4 = p4.matcher(s1) ;
    System.out.print(m2.matches() || m3.matches() || m4.matches() || m1.matches());
	}
    }
}