package thread.executer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuterRunnable {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		
		for (int i = 0; i < 5; i++) {
			executorService.execute(new Runnable(){

				@Override
				public void run() {
					System.out.println(Thread.currentThread().getName()+" hello world");
				}			
			});
		}
		
		
		executorService.shutdown();
	}

}
