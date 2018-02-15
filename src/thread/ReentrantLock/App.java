package thread.ReentrantLock;

public class App {

	public static void main(String[] args) throws InterruptedException {
		
		Processor pro = new Processor();
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					pro.producer();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					pro.consumer();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		t1.start();t2.start();
		t1.join(); t2.join();
		
		pro.finished();
	}

}
