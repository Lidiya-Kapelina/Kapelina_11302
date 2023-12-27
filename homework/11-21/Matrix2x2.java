public class Matrix2x2{
	private double[][] m=new double[2][2];
	public Matrix2x2(){
		//m= new double [2][2];
		for (int i=0;i<2;i+=1){
			for (int j=0;j<2;j+=1){
				m[i][j]=0;
			}
		}
	}
	public Matrix2x2(double d){
		for (int i=0;i<2;i+=1){
			for (int j=0;j<2;j+=1){
				m[i][j]=d;
			}	
		}
	}
	public Matrix2x2(double [][] d){
		for (int i=0;i<2;i+=1){
			for (int j=0;j<2;j+=1){
				m[i][j]=d[i][j];
			}
		}
	}
	public Matrix2x2(double d1,double d2,double d3,double d4){
		m[0][0]=d1;
		m[0][1]=d2;
		m[1][0]=d3;
		m[1][1]=d4;
	}
	public Matrix2x2 add(Matrix2x2 mat){
		Matrix2x2 res=new Matrix2x2();
		for (int i=0;i<2;i+=1){
			for (int j=0;j<2;j+=1){
				res.m[i][j]=this.m[i][j]+mat.m[i][j];
			}
		}
		return res;
	} 
	public void add2(Matrix2x2 mat){
		for (int i=0;i<2;i+=1){
			for (int j=0;j<2;j+=1){
				mat.m[i][j]=this.m[i][j]+mat.m[i][j];
			}
		}
	} 
	public Matrix2x2 sub(Matrix2x2 mat){
		Matrix2x2 res=new Matrix2x2();
		for (int i=0;i<2;i+=1){
			for (int j=0;j<2;j+=1){
				res.m[i][j]=this.m[i][j]-mat.m[i][j];
			}
		}
		return res;
	} 
	public void sub2(Matrix2x2 mat){
		for (int i=0;i<2;i+=1){
			for (int j=0;j<2;j+=1){
				mat.m[i][j]=this.m[i][j]-mat.m[i][j];
			}
		}
	} 
	public Matrix2x2 multNumber(double d){
		Matrix2x2 res=new Matrix2x2();
		for (int i=0;i<2;i+=1){
			for (int j=0;j<2;j+=1){
				res.m[i][j]=this.m[i][j]*d;
			}
		}
		return res;
	} 
	public void multNumber2(double d){
		for (int i=0;i<2;i+=1){
			for (int j=0;j<2;j+=1){
				this.m[i][j]=this.m[i][j]*d;
			}
		}
	} 
	public Matrix2x2 mult(Matrix2x2 mat){
		double pr;
		Matrix2x2 res=new Matrix2x2();
		for (int i=0;i<2;i+=1){
			for (int j=0;j<2;j+=1){
				pr=0;
				for (int t=0;t<2;t+=1){
					pr+=mat.m[j][t]*this.m[t][j];
				}
				res.m[i][j]=pr;
			}
		}
		return res;
	} 
	public void mult2(Matrix2x2 mat){
		Matrix2x2 res=new Matrix2x2();
		double pr;
		for (int i=0;i<2;i+=1){
			for (int j=0;j<2;j+=1){
				pr=0;
				for (int t=0;t<2;t+=1){
					pr+=mat.m[j][t]*this.m[t][j];
				}
				res.m[i][j]=pr;
			}
		}
		for (int i=0;i<2;i+=1){
			for (int j=0;j<2;j+=1){
					mat.m[i][j]=res.m[i][j];
			}
		}
	} 
	public double det(){
		return this.m[0][0]*this.m[1][1]-this.m[0][1]*this.m[1][0];
	}
	public void transpon() {
		Matrix2x2 res=new Matrix2x2();
		for (int i=0;i<2;i+=1){
			for (int j=0;j<2;j+=1){
					res.m[i][j]=this.m[j][i];
			}
		} 
		for (int i=0;i<2;i+=1){
			for (int j=0;j<2;j+=1){
					this.m[i][j]=res.m[i][j];
			}
		} 
	}
	public Matrix2x2 inverseMatrix(){
		if (this.det()==0){
			System.out.print("error");
			return new Matrix2x2();
		}
		else{
			Matrix2x2 res=new Matrix2x2();
			res.m[0][0]=this.m[1][1]*(1/this.det());
			res.m[1][1]=this.m[0][0]*(1/this.det());
			res.m[0][1]=-this.m[0][1]*(1/this.det());
			res.m[1][0]=-this.m[1][0]*(1/this.det());
			return res;


		}
	}
	public Matrix2x2 equivalentDiagonal(){//
		Matrix2x2 res=new Matrix2x2();
		res.m[0][0]=this.m[0][0];
		if (this.m[1][0]!=0){res.m[1][0]=0;
			res.m[1][1]=this.m[1][1]-this.m[0][1]*this.m[1][0]/this.m[0][0];}
		else{res.m[1][0]=0;
		res.m[1][0]=this.m[1][1];}
		if (res.m[1][1]!=0){res.m[0][1]=0;}
		return res;
		 
   }
	public Vector2D multVector(Vector2D v){
		Vector2D v2= new Vector2D(4,3);
		v2.x=v.x*this.m[0][0];
		v2.y=v.y*this.m[1][0];
		return v2;



	}	
	public static void main(String[]args){
		double [][] m1 = {{3,9}, {5,0}};
		double [][] m2 = {{6,10}, {2,1}};
		Matrix2x2 mat1 = new Matrix2x2(m1);
		Matrix2x2 mat2 = new Matrix2x2(m2);
		Vector2D v= new Vector2D(4,3);

		//Matrix2x2 a=mat2.add(mat1);
		//mat1.inverseMatrix().;

		System.out.print(mat1.multVector(v).x);
	}

























}