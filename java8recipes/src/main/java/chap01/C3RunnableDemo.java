package chap01;

public class C3RunnableDemo {
	
	public static void main(String[] args) {
		Runnable r = () -> System.out.println("lamda expression implementing run method");
		new Thread(r).start();
	}

}
