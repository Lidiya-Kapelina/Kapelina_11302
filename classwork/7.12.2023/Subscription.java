import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Subscription{
	private int user1_id;
	private int user2_id;
	public Subscription (int user1_id, int user2_id){
		this.user1_id=user1_id;
		this.user2_id=user2_id;
	}
	public static Subscription [] subscriptions() throws FileNotFoundException{
		Scanner scan = new Scanner(new File("Subscription.txt"));
		int n =scan.nextInt();
		Subscription[] array = new Subscription [n];
		for (int i=0; i<n; i+=1){
			array[i] = new Subscription(scan.nextInt(), scan.nextInt());
		}
		return array;
	}
	public static void main(String [] args) throws FileNotFoundException {
		subscriptions();
	}

}