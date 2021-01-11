package thread.basics;

public class JoinMethod {
	public static void main(String[] args) {
		Thread thread1 = new Thread(new ThreadCreation1(), "Pyush");
		Thread thread2 = new Thread(new ThreadCreation2(), "Rajat");
		thread1.start();
		try {
			thread1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		thread2.start();
	}

}
