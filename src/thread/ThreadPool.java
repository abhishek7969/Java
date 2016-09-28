package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPool {
	
	public static void main(String[] args) {
		/**
		 * Thread pool is like a having a number of worker in a factory.and there is a loaded task which they need to complete,and 
		 * when they finish one task take on the new task.
		 * To allocate the task we need to submit the task to the executor
		 * Executor service will run its own managerial thread
		 */
		ExecutorService executor = Executors.newFixedThreadPool(5); // number of thread created for executing the job.
		
		for(int i =0 ;i<5 ; i++){
			executor.submit(new NewProcessor(i));
		}
		executor.shutdown();
		System.out.println("All task Submited..!!");
		
		try {
			executor.awaitTermination(20, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("All task completed .. :-)");
	}

}

class NewProcessor implements  Runnable{

	private int id;
	
	public NewProcessor(int id){
		this.id = id;
	}
	
	public void run() {
		System.out.println("Starting : " + id);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Completed : "+ id);		
	}
}
