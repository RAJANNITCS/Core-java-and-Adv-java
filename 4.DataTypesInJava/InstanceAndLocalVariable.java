// WAP to show instance variable and local variable


class Person {
	//age , name instance variables
	public int age;
	public String name;
	
	//age, name local variables
	public Person(int age,String name) {
		this.age = age;
		this.name = name;
	}
	
	public void display() {
		System.out.println(this.age+" "+this.name);
	}
}

public class InstanceAndLocalVariable {
	public static void main(String[] args) {
		Person p1 = new Person(18,"rohan");
		p1.display();
	}
}
              
