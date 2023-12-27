public class Task3{
	public static void main(String [] args){
		long time = System.nanoTime();
		double eps = 1e-9;
		double x = Math.PI/6;
		double deg = x;
		double fact = 1;
		double s = 0;
		int k = 1;
		int sign = 1;
		double a = sign * deg / fact;
		while (Math.abs(a)>eps){ 
			s += a;
			k += 1;
			fact *= (2 * k - 1) * (2 * k - 2);
			deg *= x * x;
			sign =- 1 * sign;
			a = sign * deg / fact;
			System.out.println(a);
		}

		System.out.println("ans " + s);
		System.out.println("время работы по формуле " + (System.nanoTime() - time) );
		double t = Math.sin(Math.PI / 6);
		System.out.println(t);
		System.out.println("время работы функции и по формуле " + (System.nanoTime() - time));

		
	}


}