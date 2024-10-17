package chap01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class C8ConstructorReferenceDemo {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Kesav", "Manju", "Vaibhav", "Manasvi");
		List<Person> people = names.stream().map(x -> new Person(x)).collect(Collectors.toList());
		List<Person> people2 = names.stream().map(Person::new).collect(Collectors.toList());
		System.out.println(people);
		System.out.println(people2);
		List<String> names2 = people.stream().map(Person::getFirstname).collect(Collectors.toList());
		System.out.println(names2);
	}
}
