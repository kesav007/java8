package chap01;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class C14PredicateDemo {

	public String getNamesSatisfyingCondition(Predicate<String> condition, String... names) {
		return Arrays.stream(names).filter(condition).collect(Collectors.joining(", "));
	}

	public String getNamesOfLength(int length, String[] names) {
		return Arrays.stream(names)
				.filter(s -> s.length() == length)
				.collect(Collectors.joining(", "));
	}
	
	public String getNamesStartsWith(String s, String[] names) {
		return Arrays.stream(names)
				.filter(str -> str.startsWith(s))
				.collect(Collectors.joining(", "));
	}
}
