package thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * CountDownLatch lets one or more thread to wait until latch reaches count of zero.can be used for thread communication.
 * @author Abhishek.Kumar
 *
 */
public class CountDownLatchApp {

	public static void main(String[] args) {
		
		CountDownLatch latch = new CountDownLatch(2);
		
		ExecutorService executor = Executors.newFixedThreadPool(2);
		for(int i = 0 ; i<3 ; i++){
			executor.submit(new Pro(latch));
		}
		
		try {
			latch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		/** 
		 * code affter await is executed only when count down latch reaches zero
		 */
		System.out.println("***completed***");
	}
}

class Pro implements Runnable{
	private CountDownLatch latch;
	
	public Pro(CountDownLatch latch){
		this.latch = latch;
	}
	
	public void run() {
		System.out.println("Started ---");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		latch.countDown();
		
	}
	
}
