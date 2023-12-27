 import java.util.Scanner;

 public class Vector2D{
  protected double x;
  protected double y;

  public Vector2D(){
    x = 0;
    y = 0;
  }
  public Vector2D(double x,double y){
  this.x = x;
  this.y = y;
  }
  public Vector2D add(Vector2D vec){
    Vector2D res = new Vector2D();
    res.x = this.x + vec.x;
    res.y = this.y + vec.y;
    return res;
  }
  public void add2(Vector2D vec){
    this.x += vec.x;
    this.y += vec.y;
  }

  public Vector2D sub(Vector2D vec){
    Vector2D res = new Vector2D();
    res.x = this.x - vec.x;
    res.y = this.y - vec.y;
    return res;
  }
  public void sub2(Vector2D vec){
    this.x -= vec.x;
    this.y -= vec.y;
  }
  public Vector2D mult(double num){
    Vector2D res = new Vector2D();
    res.x = this.x * num;
    res.y = this.y * num;
    return res;
  }
  public void mult2(double num){
    this.x *= num;
    this.y *= num;
  }
  public String ToString(){
    return "X :" + this.x + ", Y :" + this.y;
  }
  public double length(){
    return Math.sqrt(x*x+y*y);
  }
  public double scalarProduct(Vector2D vec){
    return this.x * vec.x + this.y * vec.y;
  }
  public double cos(Vector2D vec){
    return this.scalarProduct(vec)/(this.length()+vec.length());
  }
  public boolean equals(Vector2D vec){
    return ((this.x-vec.x)<=10e-10 && (this.y-vec.y)<=10e-10);
  }


  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Vector2D v1 = new Vector2D (sc.nextDouble(), sc.nextDouble());
    Vector2D v2 = new Vector2D (sc.nextDouble() , sc.nextDouble());
    Vector2D v3 = v1.add(v2);
    System.out.println(v3.ToString());
  }

}