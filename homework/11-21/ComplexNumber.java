public class ComplexNumber{
	private double real;
	private double im;
	public ComplexNumber(){
		real=0;
		im=0;
	}
	public ComplexNumber(double real , double im){
		this.real=real;
		this.im=im;
	}
	public ComplexNumber add(ComplexNumber a) {
		ComplexNumber res= new ComplexNumber();
		res.real=this.real+a.real;
		res.im=this.im+a.im;
		return res;
	}
	public void add2(ComplexNumber a) {
		a.real=this.real+a.real;
		a.im=this.im+a.im;
	}
	public ComplexNumber sub(ComplexNumber a) {
		ComplexNumber res= new ComplexNumber();
		res.real=a.real-this.real;
		res.im=a.im-this.im;
		return res;
	}
	public void sub2(ComplexNumber a) {
		a.real=a.real-this.real;
		a.im=a.im-this.im;
	}
	public ComplexNumber multNumber(double n) {
		ComplexNumber res= new ComplexNumber();
		res.real=this.real*n;
		res.im=this.im*n;
		return res;
	}
	public void multNumber2(double n) {
		this.real=this.real*n;
		this.im=this.im*n;
	}
	public ComplexNumber mult(ComplexNumber a) {
		ComplexNumber res= new ComplexNumber();
		res.real=this.real*a.real-a.im*this.im;
		res.im=this.im*a.real+this.real*a.im;
		return res;
	}
	public void mult2(ComplexNumber a) {//
		ComplexNumber res= new ComplexNumber();
		res.real=this.real*a.real-a.im*this.im;
		res.im=this.im*a.real+this.real*a.im;
		a.real=res.real;
		a.im=res.im;

	}
	public ComplexNumber div(ComplexNumber a) {
		ComplexNumber res= new ComplexNumber();
		res.real=(a.real*this.real+a.im*this.im)/(this.real*this.real+ this.im*this.im);
		res.im=(a.im*this.real-a.real*this.im)/(this.real*this.real+ this.im*this.im);
		return res;
	}
	public void div2(ComplexNumber a) {//
		ComplexNumber res= new ComplexNumber();
		res.real=(a.real*this.real+a.im*this.im)/(this.real*this.real+ this.im*this.im);
		res.im=(a.im*this.real-a.real*this.im)/(this.real*this.real+ this.im*this.im);
		a.real=res.real;
		a.im=res.im;
		System.out.print(a.real);
	}
	
	public double length(){
		return this.im*this.im+this.real*this.real;
	}
	public String toString(){
		if (this.im>=0){
			return ""+real+" + "+im+" * i";
		} else{ 
			return ""+real+im+"*i";
		}
	}
	public double arg(){
		if (this.real>0 && this.im>0){
			return (Math.atan(this.im/this.real));
		}
		if (this.real<0 && this.im>0){
			return Math.PI-Math.atan(this.im/Math.abs(this.real));
		}
		if (this.real<0 && this.im<0){
			return -Math.PI+(Math.atan(this.im/this.real));}
		if (this.real>0 && this.im<0){return (-Math.atan(Math.abs(this.im)/this.real));
		}
		if (this.real==0 && this.im!=0){
			return Math.toRadians(90);
		}
		if(this.real!=0 && this.im==0) {
			return Math.toRadians(0)
		}
		else{
			return 0;
		}
	}
	public ComplexNumber pow(double d){
		ComplexNumber res=new ComplexNumber();
		res.real = Math.pow(this.length(),d)*(Math.cos(d*this.arg()));
		res.im = Math.pow(this.length(),d)*(Math.sin(d*this.arg()));
		return res;
	}
	
	public boolean equals(ComplexNumber a){
		return ((a.real-this.real) <= 10e-10 && (a.im-this.im)<=10e-0);
	}
	public static void main(String [] args){
			ComplexNumber a=new ComplexNumber(3,-1);
			ComplexNumber b=new ComplexNumber(-5,2);
			//b.div2(a);
			//System.out.print(a.toString());
			//System.out.print(a.arg());
			//(a.im);
	}
}