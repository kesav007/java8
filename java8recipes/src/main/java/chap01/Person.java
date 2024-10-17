package chap01;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Person {
	private String firstname;
	private String lastname;
	
	public Person() {
	}
	
	public Person(String...names ) {
		this.firstname = Arrays.stream(names).collect(Collectors.joining(" "));
	}

	public Person(String firstname) {
		this.firstname = firstname;
	}

	public Person(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return "Person [firstname=" + firstname + ", lastname=" + lastname + "]";
	}
	
}
