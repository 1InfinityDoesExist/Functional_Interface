package thread.basics.waitAndNotify;

import java.util.Scanner;

public class Processor {

	public void produce() {
		synchronized (this) {
			System.out.println("Producer thread running....");
			try {
				wait();
				System.out.println("Resumed...");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void consumes() {
		Scanner scanner = new Scanner(System.in);
		try {
			Thread.sleep(2000);
			synchronized (this) {
				System.out.println("Waiting for return key.");
				scanner.nextLine();
				System.out.println("Return key pressed.");
				notify();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		scanner.close();
	}

}
