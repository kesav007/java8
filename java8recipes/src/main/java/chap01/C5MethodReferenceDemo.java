package chap01;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class C5MethodReferenceDemo {
	public static void main(String[] args) {
		Stream.of(3, 1, 4, 8, 9, 5, 6, 7).forEach(x -> System.out.print(x));
		System.out.println();
		Stream.of(3, 1, 4, 8, 9, 5, 6, 7).forEach(System.out::print);
		System.out.println();
		Consumer<Integer> printer = System.out::print;
		Stream.of(3, 1, 4, 8, 9, 5, 6, 7).forEach(printer);
		
	}
}
