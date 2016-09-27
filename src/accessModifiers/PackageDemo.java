package accessModifiers;

import accessModifiersNew.Person;

public class PackageDemo {

	public static void main(String[] args) {

	/**
	 * will ask to change the visibility of the method to public as the constructor defined in Person.java.
	 * default access modifier is package, so can't access it from other package.
	 * Either change it to public or remove the constructor ,so compiler will puts its own public constructor . 
	 */
		Person p = new Person(); 
		
		/**
		 * Person class PersonNo has default access ,so it should not cross the boundaries.
		 */
//		System.out.println(p.PersonNo);
		
		System.out.println("Test");
	}

}
package accessModifiers;

import accessModifiersNew.Person;

public class PackageDemo {

	public static void main(String[] args) {

	/**
	 * will ask to change the visibility of the method to public as the constructor defined in Person.java.
	 * default access modifier is package, so can't access it from other package.
	 * Either change it to public or remove the constructor ,so compiler will puts its own public constructor . 
	 */
		Person p = new Person(); 
				
		/**
		 * Person class PersonNo has default access ,so it should not cross the boundaries.
		 */
//		System.out.println(p.PersonNo);
		
		
//		Explaining protected Access modifier.
		A a = new A();
		a.test();
		
		New n = new New();
		n.test();
	}

}

class A extends Person{
		
	public void test(){
		
		System.out.println(protectedVar);   //protectedVar will behave as a private but can also act as a protected and one can use it by extending the class
	}
}

class New extends A{
	public void testNew(){
		System.out.println(protectedVar);
	}
}
