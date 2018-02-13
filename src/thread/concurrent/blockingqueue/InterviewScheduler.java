package thread.concurrent.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class InterviewScheduler implements Runnable {

	private BlockingQueue<String> blockingQueue;

	public InterviewScheduler(BlockingQueue<String> blockingQueue) {
		this.blockingQueue = blockingQueue;
	}

	@Override
	public void run() {
		System.out.println("10 Candidates have arrived");

		for (int i = 1; i <= 10; i++) {
			String msg = "Candidate" + i;

			try {
				blockingQueue.put(msg);
				System.out.println("Interview scheduled for " + msg);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("*****--interview scheduled for all candidates.--*****");
		
		String stopMsg = new String("Stop");
		try {
			blockingQueue.put(stopMsg);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
