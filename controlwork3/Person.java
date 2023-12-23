abstract class Person{
	public String name;
	public int age;
	 public Person(String name, int age){
     
        this.name=name;
        this.age=age;
    }
	public abstract void display();
	public String getName(String name){
		return name;
	}
	public int getAge(int age){
		return age;
	}

	
}