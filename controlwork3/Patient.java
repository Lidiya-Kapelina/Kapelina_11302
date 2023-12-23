public class Patient extends Person{

	private String ache;
	//private String name;
	//private int age;
	public Patient(String ache, String name, int age ){
		super(name,age, getName(),getAge());
		//super(age);
		//name = super(name);
		//age = super(age);
		ache = this.ache;
		

	}
	public String getAche(){
		return this.ache;
	}
	//super(display);
	public void display(){
         
        System.out.print(getName(this.name)+getAge(this.age)+this.ache);
    }
    public static void main(String [] args){
    	Patient p1 = new Patient("head ache","Bob",19);
    	p1.display();
	}


	
}