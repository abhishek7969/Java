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
