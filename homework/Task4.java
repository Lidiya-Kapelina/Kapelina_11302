public class Task4{
	public static void main (String [] args){
		long time = System.nanoTime();
		double x1 = Math.PI / 6;
		final  double EXP = 1e-20;
		double degr =- 1;
		double fact = 2;
		double k = 1;
		double x = 1;
		double s = 1;
		double a1 = 1;
		while (Math.abs(a1) > EXP){
			x *= x1 * x1;
			a1 = degr * x / fact;
			degr *= (-1);
			fact *= (k + 1) * (k + 2);
			k += 2;
			s += a1;
			//System.out.println(a1);

		}
		System.out.println("answer " + s);
		System.out.println("время работы по формуле = " + (System.nanoTime() - time) );
		double t = Math.cos(Math.PI / 6);
		System.out.println(t);
		System.out.println("время работы функции и по формуле = " + (System.nanoTime() - time));
	}
}