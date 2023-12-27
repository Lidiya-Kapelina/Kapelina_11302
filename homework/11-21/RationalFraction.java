public class RationalFraction {
	private int chisl;
	private int znam;
	public RationalFraction(){
		chisl=0;
		znam=1;
	}
	public RationalFraction( int chisl, int znam){
		this.chisl=chisl;
		this.znam=znam;
	}
	public void reduce(){
		int min;
		if (Math.abs(this.chisl)<Math.abs(this.znam)){
			min=this.chisl;
		} else{ min=this.znam;}
		//System.out.print(this.znam);
		for (int i=min;i>0;i-=1){
			
			if (this.chisl%i==0 &&	this.znam%i==0){

				this.chisl/=i;
				this.znam/=i;
			}
		} 
	}
	public RationalFraction add(RationalFraction a) {
		RationalFraction res =  new RationalFraction();
		res.chisl=a.chisl*this.znam+this.chisl*a.znam;
		res.znam=this.znam*a.znam;
		res.reduce();
		return res;
	}
	public void add2(RationalFraction a) {
		a.chisl=a.chisl*this.znam+this.chisl*a.znam;
		a.znam=this.znam*a.znam;
		a.reduce();
	}
	public RationalFraction sub(RationalFraction a) {
		RationalFraction res =  new RationalFraction();
		res.chisl=a.chisl*this.znam-this.chisl*a.znam;
		res.znam=this.znam*a.znam;
		res.reduce();
		return res;
	}
	public void sub2(RationalFraction a) {
		a.chisl=a.chisl*this.znam-this.chisl*a.znam;
		a.znam=this.znam*a.znam;
		a.reduce();
	}
	public RationalFraction mult(RationalFraction a) {
		RationalFraction res =  new RationalFraction();
		res.chisl=a.chisl*this.chisl;
		res.znam=this.znam*a.znam;
		res.reduce();
		return res;
	}
	public void mult2(RationalFraction a) {
		a.chisl=a.chisl*this.chisl;
		a.znam=this.znam*a.znam;
		a.reduce();
	}
	public RationalFraction div(RationalFraction a) {
		RationalFraction res =  new RationalFraction();
		res.chisl=a.chisl*this.znam;
		res.znam=a.znam*this.chisl;
		res.reduce();
		return res;
	}
	public void div2(RationalFraction a) {
		a.chisl=a.chisl*this.znam;
		a.znam=this.chisl*a.znam;
		a.reduce();
	}
	public String toString(){
		return ""+this.chisl+"/"+this.znam;
	}
	public double value(){
		return (double)this.chisl/this.znam;
	}
	public boolean equals(RationalFraction a){
    return ((this.znam*a.chisl-this.chisl*a.znam)<=10e-10);
  	}
  	public int numberPart(){
		return this.chisl/this.znam;
	}
	public static void main(String [] args){
		RationalFraction a =  new RationalFraction(10,20);
		RationalFraction b =  new RationalFraction(2,3);
	//	a.reduce();
		//b.add2(a);
//		b.value
		//System.out.print(b.value());
		RationalFraction c =b.add(a);
	//	System.out.print(c.znam);

	}
}