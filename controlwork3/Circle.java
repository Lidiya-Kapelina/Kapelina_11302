import java.util.Scanner;
public class Circle{
	private double r;
	private double centrx;
	private double centry;
	public Circle (double r,double centrx,double centry){
	r = this.r;
	 centrx = this.centrx;
	 centry = this.centry;

	}
	public double len(){
		return Math.PI*2*this.r;
	}
	public double s(){
		return Math.PI*this.r*this.r;
	}
	//
	public double changepr(double pr){
		return Math.PI*this.r*this.r*pr/100;
	}
	public double sector(double dg){
		return Math.PI*this.r*this.r*dg/360;
	}
	public boolean equals(double r){
		if (this.r == r){
			return true;
		}
		else {
			return false;
		}
	}
	public int prov(double r, double centrx, double centry){
		if (this.r==r && this.centrx==centrx && this.centry==centry){ //совпадает
			return 0;
		}

		// не пересекается и не находится внутри
		if  (this.r+this.centrx< this.centrx-this.r || this.centrx-this.r > this.centrx+this.r || this.r+this.centry< this.centry-this.r || this.centry-this.r > this.centry+this.r) {
			return 2;
		}
		// находится внутри и не касается
		if (this.centrx+this.r<r+centrx && this.centrx-this.r>r-centrx &&this.centry+this.r<r+centry && this.centry-this.r>r-centry) {
			return 3;
		}
		if ( this.centrx+this.r == centrx-r || this.centrx-this.r == centrx+r || this.centry+this.r == centry-r || this.centry-this.r == centry+r ){
			return 1;
		}


		else{
			//находится внутри  и касается
			if (this.centrx+this.r<=r+centrx && this.centrx-this.r>=r-centrx &&this.centry+this.r<=r+centry && this.centry-this.r>=r-centry) {
				return -2;
			}
			else{
				return -1;
			}
		}


		
	}
	public String toString(){
		return "Окружность с радиусом "+this.r+" и центром в точке ( "+this.centrx+" ; "+this.centry+" ).";
	}


	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		//final PI=3.14
		Circle c1 = new Circle(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
		Circle c2 = new Circle(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());

	}



















}