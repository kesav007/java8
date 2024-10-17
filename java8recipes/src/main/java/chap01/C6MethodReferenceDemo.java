package chap01;

import java.util.stream.Stream;

public class C6MethodReferenceDemo {
	public static void main(String[] args) {
		Stream.generate(Math::random).limit(10).forEach(System.out::println);
	}
}
