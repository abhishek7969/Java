package core.java.sample.question.immutable;

import java.util.Date;
import java.util.List;

public final  class Person {
	private final String name;
	private final Date birthday;
	private final List hobbies;

	public Person(String name, Date birthday, List hobbies) {
		this.name = name;
		this.birthday = birthday;
		this.hobbies = hobbies;
	}

	public String getName() {	
		return name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public List getHobbies() {
		return hobbies;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", birthday=" + birthday + ", hobbies=" + hobbies + "]";
	}

}
