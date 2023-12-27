public class Task1{
	public static void main(String[] args) {
		int n= Integer.parseInt(args[0]);
		for (int d = 1;d <= n;d += 1) {
			for (int j = 1;j <= d; j += 1) {
				System.out.print("*");
			}
			System.out.println("");
		}
    
    	System.out.println("");

		System.out.println("");

		for (int a = 0;a < n;a += 1){
			for (int c = n - a; c > 0; c -= 1){
				System.out.print("*");
			}
		    System.out.println("");
		}

    	for (int a = 1;a <= n;a += 1){
			for (int b = 1;b <= n - a;b += 1){
				System.out.print(" ");
			}
			for (int c = 0;c < a;c += 1){
				System.out.print("*");
			}
    	System.out.println("");
    	}
    	

	}


}