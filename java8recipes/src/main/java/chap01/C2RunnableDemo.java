package chap01;

public class C2RunnableDemo {
	
	public static void main(String[] args) {
		new Thread(() -> System.out.println("Inside Thread constructor using lambda")).start();
	}

}
