package accessModifiersNew;

public class Person {
	String PersonNo;
	public String PersonName;
	
	/**
	 * Either remove this constructor or make it public
	 */
//	Person(){}
	
	public Person(){}
	

}
package accessModifiersNew;

public class Person {
	String PersonNo;
	public String PersonName;
	protected int protectedVar = 10;
	
	/**
	 * Either remove this constructor or make it public
	 */
//	Person(){}
	
	public Person(){}
	
	protected void test(){
		System.out.println("this is person test method");
	}
	

}
