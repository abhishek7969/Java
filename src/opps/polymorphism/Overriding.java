package opps.polymorphism;

public class Overriding  {
	
	public static void main(String[] args) {
		
		/** its mandatory test method should be present in the Person class, then at run time it will see if it is overridden in the employee 
		 * 
		 */
		Person p = new Employee();  
		//p.test(); //error as test in person is not present
		System.out.println("over riden variable="+p.i);
	}
	
}

class Person{
	int i =10;
//	 void test(){
//		System.out.println("This is person test");
//	}
}

class Employee extends Person{
	int i =20;
	protected void test(){
		System.out.println("This is emp test");
	}
}