package thread.CountDownLatch;

import java.util.concurrent.CountDownLatch;

public class Employee implements Runnable  {
	private CountDownLatch latch;
	private int timeToReachParking;
	private String emp;
	
	
	public Employee (String empName,int timeToReachParking,CountDownLatch latch ){
		this.latch = latch;
		this.timeToReachParking = timeToReachParking;
		this.emp = empName;
	}


	@Override
	public void run() {
		try {
			Thread.sleep(timeToReachParking);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(emp+" sate in car !!");
		latch.countDown();
	}
	

}
