package thread.concurrent.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class InterviewProcessor implements Runnable{

	private BlockingQueue<String> blockingQueue;

	public InterviewProcessor(BlockingQueue<String> blockingQueue) {
		this.blockingQueue = blockingQueue;
	}

	@Override
	public void run() {
		try{
			String msg;
			Thread.sleep(5000);
			while(!(msg= blockingQueue.take()).equals("Stop")){
				System.out.println("interview completed for "+ msg);
				Thread.sleep(5000);
			}
			System.out.println("*****--Interview completed for all candidates--*****");
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}

}
