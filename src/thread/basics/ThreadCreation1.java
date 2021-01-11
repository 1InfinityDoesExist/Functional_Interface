package thread.basics;

public class ThreadCreation1 extends Thread {
	@Override
	public void run() {
		Thread thread = Thread.currentThread();
		for (int iter = 0; iter < 5; iter++) {
			System.out.println(thread.getName() + "-->" + iter);
		}
		System.out.println("End of current thread ie. " + thread.getName());
	}

}
