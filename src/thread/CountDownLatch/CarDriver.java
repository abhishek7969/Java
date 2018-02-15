package thread.CountDownLatch;

import java.util.concurrent.CountDownLatch;

public class CarDriver {

	public static void main(String[] args) {

		final CountDownLatch latch = new CountDownLatch(4);

		Thread t1 = new Thread(new Employee("Emp1", 1000, latch));
		Thread t2 = new Thread(new Employee("Emp2", 1000, latch));
		Thread t3 = new Thread(new Employee("Emp3", 1000, latch));
		Thread t4 = new Thread(new Employee("Emp4", 1000, latch));

		t1.start();
		t2.start();
		t3.start();
		t4.start();

		try {
			latch.await();
			System.out.println("Car driver good to go !!");

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		

	}

}
