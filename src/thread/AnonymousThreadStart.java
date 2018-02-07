package thread;

public class AnonymousThreadStart {
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for(int i=0; i<10 ;i++){
					System.out.println(Thread.currentThread().getName()+ " Hello "+i);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		t1.start();
	}

}
