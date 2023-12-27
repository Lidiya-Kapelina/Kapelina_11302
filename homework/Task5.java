public class Task5{
	public static void main (String [] args){
		long time = System.nanoTime();
		double x = Double.parseDouble(args[0]);
		final  double EXP = 1e-5;
		double degr = 1;
		double del = 1;
		double x1 = 1;
		double s = 0;
		double a = 10;
		while (Math.abs(a) > EXP){
			x1 *= x;
			a = degr * x1 / del;
			degr *= (-1);
			del += 1;
			s += a;
			System.out.println(a);

		}
		System.out.println("answer " + s);
		System.out.println("время работы по формуле = " + (System.nanoTime() - time) );
		double t = Math.log(x + 1);
		System.out.println(t);
		System.out.println("время работы функции и по формуле = " + (System.nanoTime() - time));
	}
}