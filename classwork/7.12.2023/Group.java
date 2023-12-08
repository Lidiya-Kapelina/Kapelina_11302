import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Group{
	private int id;
	private String name;
	private String city;
	public Group (int id, String name,String city){
		this.id=id;
		this.name=name;
		this.city=city;
	}
	public static Group [] group() throws FileNotFoundException{
		Scanner scan = new Scanner(new File("Group.txt"));
		int n =scan.nextInt();
		Group [] array = new Group [n];
		for (int i=0; i<n; i+=1){
			array[i] = new Group(scan.nextInt(), scan.next(),scan.next());
		}
		return array;
	}
	public static void main(String [] args) throws FileNotFoundException {
		group();
	}

}