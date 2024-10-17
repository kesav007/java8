package chap01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class C7MethodReferenceDemo {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("this", "is", "a", "list", "of", "strings");

		List<String> sorted = strings.stream().sorted((s1, s2) -> s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println(sorted);

		List<String> sorted2 = strings.stream().sorted(String::compareTo).collect(Collectors.toList());
		System.out.println(sorted2);

		List<Integer> stringlengths = strings.stream().sorted((a, b) -> a.compareTo(b)).map(x -> x.length())
				.collect(Collectors.toList());
		System.out.println(stringlengths);

		List<Integer> stringlengths2 = strings.stream().sorted(String::compareTo).map(String::length)
				.collect(Collectors.toList());
		System.out.println(stringlengths2);
	}
}
