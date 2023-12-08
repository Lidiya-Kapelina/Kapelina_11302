import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Members{
	private int user_id;
	private int group_id;
	public Members (int user_id, int group_id){
		this.user_id=user_id;
		this.group_id=group_id;
	}
	public static Members [] members() throws FileNotFoundException{
		Scanner scan = new Scanner(new File("Members.txt"));
		int n =scan.nextInt();
		Members [] array = new Members [n];
		for (int i=0; i<n; i+=1){
			array[i] = new Members(scan.nextInt(), scan.nextInt());
		}
		return array;
	}
	public static void main(String [] args) throws FileNotFoundException {
		//System.out.print(members()[2].group_id);
	}

}