package opps.polymorphism;

public class Overriding {
	
	public static void main(String[] args) {
		Person p = new Employee();
		p.test();
		System.out.println("over riden variable="+p.i);
	}
	
}

class Person{
	int i =10;
	public void test(){
		System.out.println("This is person test");
	}
}

class Employee extends Person{
	int i =20;
	public void test(){
		System.out.println("This is emp test");
	}
}