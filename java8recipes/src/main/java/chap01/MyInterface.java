package chap01;

@FunctionalInterface
public interface MyInterface {

	int myMethod();
//	int myMethod2();
	

	default String sayHello() {
		return "Hello World";
	}

	static void myStaticMethod() {
		System.out.println("I am a static method in an interface");
	}
}
