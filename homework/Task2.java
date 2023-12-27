public class Task2{
    public static void main( String [] args){
        int n=Integer.parseInt(args[0]);
        int s = 1;
        for (int i = 1;i < n;i += 1){
            s += 2;
        }
        int b=1;
        int c=s-1;

        for (int i=n;i>0;i-=1){
            for (int u=c;u>0;u-=1){
                System.out.print(" ");
            }
            c-=1;
            for (int d=b;d>0;d-=1){
                System.out.print("*");
            }
            b+=2;
            System.out.println("");
        }

        b=1;
        int k=(s-1)/2;
        int t=s-2;
        for (int i=n;i>0;i-=1){
            for (int u=k;u>0;u-=1){
                System.out.print(" ");
            }
            
            for (int d=b;d>0;d-=1){
                System.out.print("*");
            }
            for (int y=t;y>0;y-=1){
                System.out.print(" ");
            }
            if (b!=s){
                for (int d=b;d>0;d-=1){
                    System.out.print("*");
                }
            }
            else{
                for (int d=b-1;d>0;d-=1){
                    System.out.print("*");
                }
            }
            t-=2;
            k-=1;
            b+=2;
            System.out.println("");
        }
    }
}