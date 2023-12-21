import java.util.Scanner;
public class Num2v1{
	public static void sl(double [][] a, double [] p, int m, int n){
		double [][]res=new double [m][m];
		double sum;
		double [][]newm=new double [m][m];
		for (int i1=0; i1<m; i1+=1){
			for (int i2=0; i2<m; i2+=1){
				res[i1][i2]=p[0];
				newm[i1][i2]=1;
			}
		}
		for (int e=1; e<=n;e+=1){
			for (int i=0;i<m;i+=1){			
				for (int j=0;j<m;j+=1){
					sum=0;	
					for (int k=0;k<m;k+=1){
						sum+=newm[i][k]*a[k][j];
					}
					newm[i][j]=sum;
				}
			}
			for (int i1=0; i1<m; i1+=1){
				for (int i2=0; i2<m; i2+=1){
					res[i1][i2]+=newm[i1][i2]*p[e];
				}
			}
		}
		for (int i1=0; i1<m; i1+=1){
			for (int i2=0; i2<m; i2+=1){
				System.out.print(res[i1][i2]+" ");
			}
			System.out.println("");
		}

	}
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		int m= sc.nextInt();
		//String er=sc.nextLine();
		double [][] a = new double [m][m];
		for (int i1=0; i1<m; i1+=1){
			for (int i2=0; i2<m; i2+=1){
				a[i1][i2]=sc.nextInt();
			}
		}
		int n= sc.nextInt();
		double [] p = new double [n+1];
		for (int i1=0; i1<n+1; i1+=1){
			p[i1]=sc.nextInt();
		}
		sl(a,p,m,n);
	}
}