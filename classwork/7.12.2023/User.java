import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class User{
	private int id;
	private String name;
	private String city;
	public User (int id, String name, String city){
		this.id=id;
		this.name=name;
		this.city=city;

	}
	public static User [] users() throws FileNotFoundException{
		Scanner scan = new Scanner(new File("Users.txt"));
		int n =scan.nextInt();
		User [] array = new User [n];
		for (int i=0; i<n; i+=1){
			array[i] = new User(scan.nextInt(), scan.next(),scan.next());
		}
		return array;
	}

	public static void main(String [] args) throws FileNotFoundException {
		
		System.out.print(users()[1].name);
	}

}