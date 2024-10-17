package chap01;

import java.util.Arrays;
import java.util.List;

public class C10RemoveIfDemo {
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(3, 1, 4, 1, 5, 9);
		boolean removed = numbers.removeIf(n -> n <=0 );
		System.out.println("Elements were " + (removed ?  "" : "NOT") + " removed");
		numbers.forEach(System.out::println);
	}

}
