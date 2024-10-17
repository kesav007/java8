package chap01;

public class C1RunnableDemo {
	public static void main(String[] args) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Inside runnable using an anonymous inner class");
			}
		}).start();
	}
}
