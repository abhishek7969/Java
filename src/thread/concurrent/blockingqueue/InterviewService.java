package thread.concurrent.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class InterviewService {

	public static void main(String[] args) {
			BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<String>(3);
			InterviewScheduler producer = new InterviewScheduler(blockingQueue);
			InterviewProcessor consumer = new InterviewProcessor(blockingQueue);
					
			Thread t1 = new Thread(producer);
			t1.start();
			
			Thread t2 = new Thread(consumer);
			t2.start();
	}

}
