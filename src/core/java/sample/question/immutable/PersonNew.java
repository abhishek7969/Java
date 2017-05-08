package core.java.sample.question.immutable;

import java.util.Collections;
import java.util.Date;
import java.util.List;

public class PersonNew {
	private final String name;
	private final Date birthday;
	private final List hobbies;

	public PersonNew(String name, Date birthday, List hobbies)
	{ this.name = name; this.birthday = birthday; this.hobbies = hobbies; 
	}

	public String getName() {
		return name;
	}

	public Date getBirthday() {
		return (Date) birthday.clone();
	}

	public List getHobbies() {
		return Collections.unmodifiableList(hobbies);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", birthday=" + birthday + ", hobbies=" + hobbies + "]";
	}

}
