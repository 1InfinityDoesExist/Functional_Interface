package thread.basics.waitAndNotify;

public class WaitAndNotify {
	public static void main(String[] args) {
		final Processor processor = new Processor();
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				processor.produce();
			}

		});

		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				processor.consumes();
			}

		});

		thread1.start();
		thread2.start();
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

}
