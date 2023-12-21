import java.util.Scanner;
public class Num3v1{
	public static void kol(int [][]m,int n){
		int [] count={0,0,0,0,0,0,0,0,0,0};
		int num;
		int nn;
		for (int i1=0; i1<n; i1+=1){
			for (int i2=0; i2<n; i2+=1){
			
				num = m[i1][i2];
				while (num>0){
					nn=num%10;
					count[nn]+=1;
					num=num/10;

				}
			}

		}
		for (int i=0; i<10; i+=1){
			System.out.println(""+i+":"+count[i]+" times");
		}
	}
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		//String er=sc.nextLine();
		int [][] m = new int [n][n];
		for (int i1=0; i1<n; i1+=1){
			for (int i2=0; i2<n; i2+=1){
			
				m[i1][i2]=sc.nextInt();
			}
		}
		kol(m,n);
	}
}