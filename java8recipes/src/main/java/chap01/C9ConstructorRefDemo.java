package chap01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class C9ConstructorRefDemo {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Kesav Nallan", "Manju Saamavedam", "Vaibhav Nallan", "Manasvi Nallan");
		List<Person> peop = names.stream().map(name -> name.split(" ")).map(Person::new).collect(Collectors.toList());
		System.out.println(peop);
	}
}
