package thread.waitnotify;

import java.util.Scanner;

public class Processor {

	public void producer() throws InterruptedException {
		synchronized (this) {
			System.out.println("Producer waiting !!!");
			wait();
			System.out.println("Woken up !! ");
		}

	}

	public void consumer() throws InterruptedException {
		synchronized (this) {
			Thread.sleep(2000);
			System.out.println("waiting for the return key !!!");
			new Scanner(System.in).nextLine();
			System.out.println("Return key pressed .");
			notify();
			Thread.sleep(1000);
			System.out.println("Returning from consumer");
		}

	}

}
