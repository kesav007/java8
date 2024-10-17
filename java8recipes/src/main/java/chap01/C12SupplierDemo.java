package chap01;

import java.util.function.DoubleSupplier;

public class C12SupplierDemo {

	public static void main(String[] args) {
		DoubleSupplier supplier = new DoubleSupplier() {			
			@Override
			public double getAsDouble() {
				return Math.random();
			}
		};
		DoubleSupplier randomSupplier = Math::random;
		System.out.println(randomSupplier);
	}

}
